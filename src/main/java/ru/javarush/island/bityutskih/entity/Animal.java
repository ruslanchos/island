package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.entity.Nature;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Animal implements Nature {

    private final float WEIGHT;
    private final int MAX_COUNTER;
    private final int SPEED;
    private final float MAX_FOOD;
    private AtomicBoolean isDead = new AtomicBoolean(false);
    private float full = 0;


    public Animal(float weight, int max_counter, int speed, float max_food) {
        this.WEIGHT = weight;
        this.MAX_COUNTER = max_counter;
        this.SPEED = speed;
        this.MAX_FOOD = max_food;
    }



    public abstract float getWeight();

    @Override
    public abstract int getobjPerService();

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
