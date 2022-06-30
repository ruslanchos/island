package ru.javarush.island.bityutskih.Services;

import ru.javarush.island.bityutskih.Services.Plant;
import ru.javarush.island.bityutskih.Services.Service;

public class PlantRunner implements Runnable {
    private final Plant plant;
    private final Service Service;
//    public PlantRunner(Plant plant, Service Service) {
//    }
//
//    @Override
//    public void run() {

   public PlantRunner(Plant plant, Service Service) {
            this.plant = plant;
            this.Service = Service;
        }

        @Override
        public void run() {
            do {
                reproduce();
                Sleep.sleep(10);
            } while (!Thread.currentThread().isInterrupted());
        }

        public void reproduce() {
           // System.out.println(plant.getClass().getCanonicalName() + " reproduce");
        }
    }
