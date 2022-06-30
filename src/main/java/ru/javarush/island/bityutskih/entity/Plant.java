package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.entity.Nature;

import java.util.concurrent.atomic.AtomicBoolean;

public class Plant implements Nature{
    private final float WEIGHT = 1;
    private final int MAX_COUNTER = 200;
    private AtomicBoolean isDead = new AtomicBoolean(false);

    public float getWeight() {
        return WEIGHT;
    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public int getobjPerService() {
        return MAX_COUNTER;
    }

    public void setDead() {
        isDead.set(true);
    }

    public void setAlive() {
        isDead.set(false);
    }

    @Override
    public Nature getInstance() {
        return new Plant();
    }

    @Override
    public String toString() {
        return "Plant";
    }
}