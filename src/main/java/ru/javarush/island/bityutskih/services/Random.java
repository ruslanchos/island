package ru.javarush.island.bityutskih.services;


import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public Random() {
    }

    public static int getRandomsNum(int num) {
        return ThreadLocalRandom.current().nextInt(num);
    }

    public static int getRandomsNum(int from, int num) {

        return ThreadLocalRandom.current().nextInt(from, num);
    }
}


