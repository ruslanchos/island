package ru.javarush.island.bityutskih.Services;


import ru.javarush.island.bityutskih.Services.Animal;
import ru.javarush.island.bityutskih.Services.Service;

public class AnimalRunner implements Runnable {
    public AnimalRunner(Animal animal, Service Service) {
    }

    @Override
    public void run() {

    }
}



/*
package ru.javarush.island.bityutskih.Services;

import ru.javarush.island.bityutskih.entity.Animal;
import ru.javarush.island.bityutskih.entity.Nature;
import ru.javarush.island.bityutskih.entity.Plant;
import ru.javarush.island.bityutskih.entity.Setting;
import ru.javarush.island.bityutskih.entity.Random;
import ru.javarush.island.bityutskih.entity.Service;

import java.util.concurrent.CopyOnWriteArrayList;

import static ru.javarush.island.bityutskih.Services.Random.getRandomsNum;

public class AnimalRunner implements Runnable {
    private final Animal animal;
    private final Service Service;

    public AnimalRunner(Animal animal, Service Service) {
        this.animal = animal;
        this.Service = Service;
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
        CopyOnWriteArrayList<Nature> nature = Service.getNature();

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
            int randomsNum = getRandomsNum(1000);
            if (chance >= randomsNum) {
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
        if(!animal.isDead());

    }

    public void move() {
        if (!animal.isDead());

        }
    }
}*/
