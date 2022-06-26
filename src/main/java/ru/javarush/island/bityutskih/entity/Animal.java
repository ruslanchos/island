package ru.javarush.island.bityutskih.entity;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Animal implements Nature {
    private AtomicBoolean isDead = new AtomicBoolean(false);
    private float full = 0;

    public abstract float getWeight();

    public abstract int getSpeciesPerService();

    public abstract int getSpeed();

    public abstract float getMaxFood();

    public abstract HashMap<String, Integer> getEating();


    public boolean isDead() {
        return isDead.get();
    }

    public void setDead() {
        isDead.set(true);
    }

    public float getFull() {
        return full;
    }

    public void setFull(float full) {
        this.full = full;
    }

}
