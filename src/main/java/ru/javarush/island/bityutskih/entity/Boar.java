package ru.javarush.island.bityutskih.entity;


import ru.javarush.island.bityutskih.Herbivores;

import java.util.HashMap;

public class Boar extends Herbivores {
    private final float WEIGHT = 400;
    private final int MAX_COUNTER = 50;
    private final int SPEED = 2;
    private final float MAX_FOOD = 50;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Boar() {
        EATING.put(Bear.class.getCanonicalName(), 0);
        EATING.put(Boa.class.getCanonicalName(), 0);
        EATING.put(Buffalo.class.getCanonicalName(), 0);
        EATING.put(Caterpillar.class.getCanonicalName(), 90);
        EATING.put(Deer.class.getCanonicalName(), 0);
        EATING.put(Duck.class.getCanonicalName(), 0);
        EATING.put(Eagle.class.getCanonicalName(), 0);
        EATING.put(Fox.class.getCanonicalName(), 0);
        EATING.put(Goat.class.getCanonicalName(), 0);
        EATING.put(Horse.class.getCanonicalName(), 0);
        EATING.put(Mouse.class.getCanonicalName(), 50);
        EATING.put(Plant.class.getCanonicalName(), 100);
        EATING.put(Rabbit.class.getCanonicalName(), 0);
        EATING.put(Sheep.class.getCanonicalName(), 0);
        EATING.put(Wolf.class.getCanonicalName(), 0);
    }

    public float getWeight() {
        return WEIGHT;
    }

    public int getSpeciesPerService() {
        return MAX_COUNTER;
    }

    public int getSpeed() {
        return SPEED;
    }

    public float getMaxFood() {
        return MAX_FOOD;
    }

    public HashMap<String, Integer> getEating() {
        return EATING;
    }

    public Nature getInstance() {
        return new Boa();
    }
}