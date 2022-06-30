package ru.javarush.island.bityutskih.Services;

public class Sleep {
    private Sleep() {
    }

    public static void sleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}