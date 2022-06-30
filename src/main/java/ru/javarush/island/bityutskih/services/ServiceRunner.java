package ru.javarush.island.bityutskih.Services;

import ru.javarush.island.bityutskih.Services.Animal;
import ru.javarush.island.bityutskih.Services.Nature;
import ru.javarush.island.bityutskih.Services.Plant;
import ru.javarush.island.bityutskih.Services.Service;
import java.util.concurrent.*;


public class ServiceRunner {
    private final Service Service;

    public ServiceRunner() {
        this.Service = new Service();
    }
    public void runService() {
        Service.makeNature();
        CopyOnWriteArrayList<Nature> nature = Service.getNature();
        ExecutorService animalExecService = Executors.newFixedThreadPool(100);
        ExecutorService plantExecService = Executors.newFixedThreadPool(100);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10000);

        scheduledExecutorService.scheduleAtFixedRate(new ServiceStatistics(Service), 0, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new ServiceClean(Service), 500, 1000, TimeUnit.MILLISECONDS);

        for (Nature a : nature) {
            if (a instanceof Animal) {
                animalExecService.submit(new AnimalRunner((Animal) a, Service));
            } else if (a instanceof Plant) {
                plantExecService.submit(new PlantRunner((Plant) a, Service));
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
