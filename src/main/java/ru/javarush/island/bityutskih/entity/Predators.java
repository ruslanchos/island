package ru.javarush.island.bityutskih.entity;

import ru.javarush.island.bityutskih.entity.Animal;
import ru.javarush.island.bityutskih.entity.Nature;


public abstract class Predators extends Animal {
    public Predators(float weight, int max_counter, int speed, float max_food) {
        super(weight, max_counter, speed, max_food);
    }

    //public abstract Nature getInstance();
}
