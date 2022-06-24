package com.javarush.island.bityutskih.services;


import java.util.concurrent.ThreadLocalRandom;

public class Random {
    private Random() {
    }

    public static int getRandom(int num) {
        return ThreadLocalRandom.current().nextInt(num);
    }
    public static int getRandom(int from, int num) {
        return ThreadLocalRandom.current().nextInt(from, num);
    }

}
