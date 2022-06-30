package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.Services.Animal;

public abstract class Herbivores extends Animal {
    public Herbivores() {
        super(weight, max_counter, speed, max_food);
    }

    public abstract int getobjPerService();
}
