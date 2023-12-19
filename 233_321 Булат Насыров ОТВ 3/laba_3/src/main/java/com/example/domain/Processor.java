package com.example.domain;

public class Processor extends Hardware {

    private final String socket;

    private final String model;

    public Processor (long id, String name, double cost, String socket, String model) {
        super(id, name, cost);
        this.socket = socket;
        this.model = model;
    }

    public String getSocket() {
        return socket;
    }

    public String getModel() {
        return model;
    }
}
