package ru.javarush.island.bityutskih.Services;

import ru.javarush.island.bityutskih.entity.Predators;
import ru.javarush.island.bityutskih.entity.Nature;

import java.util.HashMap;

public class Snake extends Predators {
    private final float WEIGHT = 15;
    private final int MAX_COUNTER = 30;
    private final int SPEED = 1;
    private final float MAX_FOOD = 3;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Snake() {
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

    @Override
    public Nature getInstance() {
        return new Snake();
    }


}
