package ru.javarush.island.bityutskih.entity;


import java.util.HashMap;

public class Boa extends Predators {
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Boa() {
        super(15,30,1,3);
        EATING.put(Bear.class.getCanonicalName(), 0);
        EATING.put(Boar.class.getCanonicalName(), 0);
        EATING.put(Buffalo.class.getCanonicalName(), 0);
        EATING.put(Caterpillar.class.getCanonicalName(), 0);
        EATING.put(Deer.class.getCanonicalName(), 0);
        EATING.put(Duck.class.getCanonicalName(), 10);
        EATING.put(Eagle.class.getCanonicalName(), 0);
        EATING.put(Fox.class.getCanonicalName(), 15);
        EATING.put(Goat.class.getCanonicalName(), 0);
        EATING.put(Horse.class.getCanonicalName(), 0);
        EATING.put(Mouse.class.getCanonicalName(), 40);
        EATING.put(Plant.class.getCanonicalName(), 0);
        EATING.put(Rabbit.class.getCanonicalName(), 20);
        EATING.put(Sheep.class.getCanonicalName(), 0);
        EATING.put(Wolf.class.getCanonicalName(), 0);
    }

    public float getWeight() {
        float WEIGHT = 15;
        return WEIGHT;
    }

    @Override
    public int getobjPerService() {
        int MAX_COUNTER = 30;
        return MAX_COUNTER;
    }

    public int getSpeed() {
        int SPEED = 1;
        return SPEED;
    }

    public float getMaxFood() {
        float MAX_FOOD = 3;
        return MAX_FOOD;
    }

    public HashMap<String, Integer> getEating() {
        return EATING;
    }

    @Override
    public Nature getInstance() {
        return new Boa();
    }


}
