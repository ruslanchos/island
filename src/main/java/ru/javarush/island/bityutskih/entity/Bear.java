package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.Predators;

import java.util.HashMap;
import java.util.Set;

public class Bear extends Predators {
    private final float WEIGHT = 500;
    private final int MAX_COUNTER = 5;
    private final int SPEED = 2;
    private final float MAX_FOOD = 80;
    private final HashMap<String, Integer> EATING = new HashMap<>();

    public Bear(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<Animal> herbivores) {

    }

    @Override
    public void multiply() {

    }

}

