package ru.javarush.island.bityutskih.entity;

public interface Nature {
    int getSpeciesPerService();

    void setDead();

    float getWeight();

    boolean isDead();

    Nature getInstance();
}
