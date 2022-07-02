package ru.javarush.island.bityutskih.services;

import ru.javarush.island.bityutskih.entity.Plant;
import ru.javarush.island.bityutskih.entity.Service;
import ru.javarush.island.bityutskih.services.Sleep;


public class PlantRunner implements Runnable {
    private final Plant plant;
    private final Service service;
//    public PlantRunner(Plant plant, Service Service) {
//    }
//
//    @Override
//    public void run() {

   public PlantRunner(Plant plant, Service service) {
            this.plant = plant;
            this.service = service;
        }

        @Override
        public void run() {
            do {
                reproduce();
                Sleep.sleep(10);
            } while (!Thread.currentThread().isInterrupted());
        }

        public void reproduce() {

        }
    }
