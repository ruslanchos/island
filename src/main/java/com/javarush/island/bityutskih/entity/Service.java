package com.javarush.island.bityutskih.entity;

import java.util.concurrent.CopyOnWriteArrayList;

public class Service {

    private final CopyOnWriteArrayList<Nature> nature = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Nature> getNature() {
        return nature;
    }

    public void makeNature() {
        preAnimal(new Bear());
        preAnimal(new Boa());
        preAnimal(new Boar());
        preAnimal(new Buffalo());
        preAnimal(new Caterpillar());
        preAnimal(new Deer());
        preAnimal(new Duck());
        preAnimal(new Eagle());
        preAnimal(new Fox());
        preAnimal(new Goat());
        preAnimal(new Horse());
        preAnimal(new Mouse());
        preAnimal(new Plant());
        preAnimal(new Rabbit());
        preAnimal(new Sheep());
        preAnimal(new Wolf());
    }
    private void preAnimal(Nature n){
        nature.add(n);
    }
}
