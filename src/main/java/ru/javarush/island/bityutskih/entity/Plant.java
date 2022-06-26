package ru.javarush.island.bityutskih.entity;

import java.util.concurrent.atomic.AtomicBoolean;

public class Plant implements Nature{
    private final float WEIGHT = 1;
    private final int MAX_COUNTER = 200;
    private AtomicBoolean isDead = new AtomicBoolean(false);

    public float getWeight() {
        return WEIGHT;
    }
    public int getSpeciesPerService() {
        return MAX_COUNTER;
    }

    public boolean isDead() {
        return isDead.get();
    }

    public void setDead() {
        isDead.set(true);
    }

    @Override
    public Nature getInstance() {
        return new Plant();
    }

}
