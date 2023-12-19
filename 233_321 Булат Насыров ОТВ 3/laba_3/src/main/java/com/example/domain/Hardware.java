package com.example.domain;

public class Hardware {

    private final long id;

    private String name;

    private double cost;

    public Hardware(long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public void raiseCost(double increase){
        if (increase > 0){
            this.cost += increase;
        }
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }


}
