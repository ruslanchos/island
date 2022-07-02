package ru.javarush.island.bityutskih.services;
import ru.javarush.island.bityutskih.entity.*;
import ru.javarush.island.bityutskih.entity.Herbivores;
import ru.javarush.island.bityutskih.entity.Predators;
import ru.javarush.island.bityutskih.entity.Nature;
import ru.javarush.island.bityutskih.entity.Plant;

import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceStatistics implements Runnable {
    private final Service service;
    public ServiceStatistics(Service service) {
        this.service = service;
    }

        @Override
        public void run() {
            int predatorCounter = 0;
            int herbCounter = 0;
            int plantCounter = 0;
            int deadCounter = 0;

            CopyOnWriteArrayList<Nature> nature = service.getNature();
            for (Nature obj : nature) {
                if(obj instanceof Predators && !obj.isDead()) {
                    predatorCounter++;
                } else if (obj instanceof Herbivores && !obj.isDead()) {
                    herbCounter++;
                } else if (obj instanceof Plant && !obj.isDead()) {
                    plantCounter++;
                }
                if(obj.isDead()) {
                    deadCounter++;
                }
            }
            System.out.println("Хищников: " + predatorCounter );
            System.out.println("Травоядных: " + herbCounter );
            System.out.println("Трава: " + plantCounter);
            System.out.println("Погибло: " + deadCounter);
            System.out.println("***********************************************");
        }
    }