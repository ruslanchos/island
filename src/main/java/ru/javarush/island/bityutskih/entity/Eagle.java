package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.entity.Predators;
import ru.javarush.island.bityutskih.entity.Nature;

import java.util.HashMap;

public class Eagle extends Predators {
    private final float WEIGHT = 6;
    private final int MAX_COUNTER = 20;
    private final int SPEED = 3;
    private final float MAX_FOOD = 1;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Eagle() {
        super(6,20,3,1);
        EATING.put(Bear.class.getCanonicalName(), 0);
        EATING.put(Boa.class.getCanonicalName(), 0);
        EATING.put(Boar.class.getCanonicalName(), 0);
        EATING.put(Buffalo.class.getCanonicalName(), 0);
        EATING.put(Caterpillar.class.getCanonicalName(), 0);
        EATING.put(Deer.class.getCanonicalName(), 0);
        EATING.put(Duck.class.getCanonicalName(), 80);
        EATING.put(Fox.class.getCanonicalName(), 10);
        EATING.put(Goat.class.getCanonicalName(), 0);
        EATING.put(Horse.class.getCanonicalName(), 0);
        EATING.put(Mouse.class.getCanonicalName(), 90);
        EATING.put(Plant.class.getCanonicalName(), 0);
        EATING.put(Rabbit.class.getCanonicalName(), 90);
        EATING.put(Sheep.class.getCanonicalName(), 0);
        EATING.put(Wolf.class.getCanonicalName(), 0);
    }

    public float getWeight() {
        return WEIGHT;
    }

    @Override
    public int getobjPerService() {
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
        return new Eagle();
    }
}