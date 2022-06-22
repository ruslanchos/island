package com.javarush.island.bityutskih.services;


import com.javarush.island.bityutskih.entity.Service;

public class ServiceStatistics implements Runnable {
    private final Service service;
    public ServiceStatistics(Service service) {
        this.service = service;
    }

    @Override
    public void run() {

    }
}
