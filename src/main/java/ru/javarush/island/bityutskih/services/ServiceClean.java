package ru.javarush.island.bityutskih.Services;

import ru.javarush.island.bityutskih.Services.Nature;
import ru.javarush.island.bityutskih.Services.Service;

import java.util.concurrent.CopyOnWriteArrayList;

public class ServiceClean implements Runnable{
    private final Service Service;
    public ServiceClean(Service Service)
    {
        this.Service = Service;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        CopyOnWriteArrayList<Nature> nature = Service.getNature();

        for (int i = 0; i < nature.size(); i++) {
            if (nature.get(i) != null && nature.get(i).isDead()) {
                nature.remove(i);
                i--;
            }
        }

    }
}

