package com.javarush.island.bityutskih.services;

import com.javarush.island.bityutskih.entity.Service;

public class ServiceClean implements Runnable{
    private final Service service;
    public ServiceClean(Service service)
    {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

