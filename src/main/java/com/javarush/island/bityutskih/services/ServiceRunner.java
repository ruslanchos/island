package com.javarush.island.bityutskih.services;

import com.javarush.island.bityutskih.entity.Animal;
import com.javarush.island.bityutskih.entity.Nature;
import com.javarush.island.bityutskih.entity.Plant;
import com.javarush.island.bityutskih.entity.Service;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ServiceRunner {
    private final Service service;
    public ServiceRunner() {
        this.service = new Service();
    }
    public void runService() {
        service.makingNature();
        CopyOnWriteArrayList<Nature> nature = service.getNature();
        ExecutorService animalExecService = Executors.newFixedThreadPool(2);
        ExecutorService plantExecService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService shedulerExecService = Executors.newScheduledThreadPool(8);


        for (Nature a : nature) {
            if (a instanceof Animal) {
                animalExecService.submit(new AnimalRunner((Animal) a, service));
            } else if (a instanceof Plant) {
                plantExecService.submit(new PlantRunner((Plant) a, service));
            }

        }

    }
}
