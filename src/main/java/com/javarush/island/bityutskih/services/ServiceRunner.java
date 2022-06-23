package com.javarush.island.bityutskih.services;

import com.javarush.island.bityutskih.entity.Animal;
import com.javarush.island.bityutskih.entity.Nature;
import com.javarush.island.bityutskih.entity.Plant;
import com.javarush.island.bityutskih.entity.Service;
import java.util.concurrent.*;
import java.util.Scanner;


public class ServiceRunner {
    private final Service service;

    public ServiceRunner() {
        this.service = new Service();
    }
    public void runService() {
        service.makeNature();
        CopyOnWriteArrayList<Nature> nature = service.getNature();
        ExecutorService animalExecService = Executors.newFixedThreadPool(2);
        ExecutorService plantExecService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);

        scheduledExecutorService.scheduleAtFixedRate(new ServiceStatistics(service), 0, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new ServiceClean(service), 500, 1000, TimeUnit.MILLISECONDS);

        for (Nature a : nature) {
            if (a instanceof Animal) {
                animalExecService.submit(new AnimalRunner((Animal) a, service));
            } else if (a instanceof Plant) {
                plantExecService.submit(new PlantRunner((Plant) a, service));
            }

        }
        try {
            Thread.currentThread().sleep(5000);
            animalExecService.shutdown();
            plantExecService.shutdown();
            scheduledExecutorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        animalExecService.shutdownNow();
        plantExecService.shutdownNow();
        scheduledExecutorService.shutdownNow();
    }
}
