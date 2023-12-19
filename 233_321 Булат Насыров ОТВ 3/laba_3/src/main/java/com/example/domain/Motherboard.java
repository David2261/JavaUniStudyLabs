package com.example.domain;

public class Motherboard extends Hardware {

    private final String socket;
    public Motherboard (long id, String name, double cost, String socket) {
        super(id, name, cost);
        this.socket = socket;
    }

    public String getSocket() {
        return this.socket;
    }
}
