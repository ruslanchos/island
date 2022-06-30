package ru.javarush.island.bityutskih.Services;


import ru.javarush.island.bityutskih.entity.Herbivores;
import ru.javarush.island.bityutskih.entity.Predators;
import ru.javarush.island.bityutskih.Services.Nature;
import ru.javarush.island.bityutskih.Services.Plant;

import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceStatistics implements Runnable {
    private final Service Service;
    public ServiceStatistics(Service Service) {
        this.Service = Service;
    }

        @Override
        public void run() {
            int predatorCount = 0;
            int herbCount = 0;
            int plantCount = 0;
            int deadCount = 0;

            CopyOnWriteArrayList<Nature> nature = Service.getNature();
            for (Nature obj : nature) {
                if(obj instanceof Predators && !obj.isDead()) {
                    predatorCount++;
                } else if (obj instanceof Herbivores && !obj.isDead()) {
                    herbCount++;
                } else if (obj instanceof Plant && !obj.isDead()) {
                    plantCount++;
                }
                if(obj.isDead()) {
                    deadCount++;
                }
            }
            System.out.println("Хищники: " + predatorCount + " VS Травоядные: " + herbCount + " VS Трава: " + plantCount+ "                    Умерло: " + deadCount);
        }
    }