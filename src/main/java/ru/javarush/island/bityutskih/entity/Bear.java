package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.Predators;

import java.util.HashMap;

public class Bear extends Predators {
    private final float WEIGHT = 500;
    private final int MAX_COUNTER = 5;
    private final int SPEED = 2;
    private final float MAX_FOOD = 80;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Bear() {
        EATING.put(Boa.class.getCanonicalName(), 80);
        EATING.put(Boar.class.getCanonicalName(), 50);
        EATING.put(Buffalo.class.getCanonicalName(), 20);
        EATING.put(Caterpillar.class.getCanonicalName(), 0);
        EATING.put(Deer.class.getCanonicalName(), 80);
        EATING.put(Duck.class.getCanonicalName(), 10);
        EATING.put(Eagle.class.getCanonicalName(), 0);
        EATING.put(Fox.class.getCanonicalName(), 0);
        EATING.put(Goat.class.getCanonicalName(), 70);
        EATING.put(Horse.class.getCanonicalName(), 40);
        EATING.put(Mouse.class.getCanonicalName(), 90);
        EATING.put(Plant.class.getCanonicalName(), 0);
        EATING.put(Rabbit.class.getCanonicalName(), 80);
        EATING.put(Sheep.class.getCanonicalName(), 70);
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

    @Override
    public Nature getInstance() {
        return new Bear();
    }
}
