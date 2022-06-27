package ru.javarush.island.bityutskih.services;


import ru.javarush.island.bityutskih.Herbivores;
import ru.javarush.island.bityutskih.Predators;
import ru.javarush.island.bityutskih.entity.Nature;
import ru.javarush.island.bityutskih.entity.Plant;
import ru.javarush.island.bityutskih.entity.Service;

import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceStatistics implements Runnable {
    private final Service service;
    public ServiceStatistics(Service service) {
        this.service = service;
    }

        @Override
        public void run() {
            int predatorCount = 0;
            int herbCount = 0;
            int plantCount = 0;
            int deadCount = 0;

            CopyOnWriteArrayList<Nature> nature = service.getNature();
            for (Nature species : nature) {
                if(species instanceof Predators && !species.isDead()) {
                    predatorCount++;
                } else if (species instanceof Herbivores && !species.isDead()) {
                    herbCount++;
                } else if (species instanceof Plant && !species.isDead()) {
                    plantCount++;
                }
                if(species.isDead()) {
                    deadCount++;
                }
            }
            System.out.println("Хищники: " + predatorCount + " VS Травоядные: " + herbCount + " VS Трава: " + plantCount+ "                    Умерло: " + deadCount);
        }
    }