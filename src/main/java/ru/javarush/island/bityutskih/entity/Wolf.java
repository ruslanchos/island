package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.Predators;

import java.util.HashMap;

public class Wolf extends Predators {
    private final float WEIGHT = 50;
    private final int MAX_COUNTER = 30;
    private final int SPEED = 3;
    private final float MAX_FOOD = 8;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Wolf() {
        EATING.put(Bear.class.getCanonicalName(), 0);
        EATING.put(Snake.class.getCanonicalName(), 0);
        EATING.put(Boar.class.getCanonicalName(), 15);
        EATING.put(Buffalo.class.getCanonicalName(), 10);
        EATING.put(Caterpillar.class.getCanonicalName(), 0);
        EATING.put(Deer.class.getCanonicalName(), 15);
        EATING.put(Duck.class.getCanonicalName(), 40);
        EATING.put(Eagle.class.getCanonicalName(), 0);
        EATING.put(Fox.class.getCanonicalName(), 0);
        EATING.put(Goat.class.getCanonicalName(), 60);
        EATING.put(Horse.class.getCanonicalName(), 10);
        EATING.put(Mouse.class.getCanonicalName(), 80);
        EATING.put(Plant.class.getCanonicalName(), 0);
        EATING.put(Rabbit.class.getCanonicalName(), 60);
        EATING.put(Sheep.class.getCanonicalName(), 70);
    }

    public float getWeight() {
        return WEIGHT;
    }

    @Override
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
        return new Wolf();
    }
}
