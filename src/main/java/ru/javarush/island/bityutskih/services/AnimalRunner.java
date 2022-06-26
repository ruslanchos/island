package ru.javarush.island.bityutskih.services;

import ru.javarush.island.bityutskih.entity.Animal;
import ru.javarush.island.bityutskih.entity.Service;

import java.util.concurrent.CopyOnWriteArrayList;

public class AnimalRunner implements Runnable {
    private final Animal animal;
    private final Service service;

    public AnimalRunner(Animal animal, Service service) {
        this.animal = animal;
        this.service = service;
    }

    @Override
    public void run() {
        do {
            Sleep.sleep(100);
            eat();
            Sleep.sleep(100);
            reproduce();
            Sleep.sleep(100);
            move();
            Sleep.sleep(100);
        } while (!Thread.currentThread().isInterrupted());
    }

    public void eat() {
        CopyOnWriteArrayList<Nature> nature = service.getNature();

        for (Nature n : nature) {
            if (animal != n
                    && !animal.isDead()
                    && !n.isDead()
                    && animal.getMaxFood() > animal.getFull()) {
                tryToEat(n);
            }
        }
    }

    private void tryToEat(Nature n) {
        Integer chance = animal.getEating().get(n.getClass().getCanonicalName());
        if (chance != null && chance > 0) {
            int randomNum = Random.getRandomNum(100);
            if (chance >= randomNum) {
                if (n instanceof Plant) {
                    animal.setFull(animal.getFull() + n.getWeight());
                } else {
                    n.setDead();
                    animal.setFull(animal.getFull() + n.getWeight());
                }
            }
        }
    }

    public void reproduce() {
        if (!animal.isDead()) {
        }
    }

    public void move() {
        if (!animal.isDead()) {
        }
    }
}