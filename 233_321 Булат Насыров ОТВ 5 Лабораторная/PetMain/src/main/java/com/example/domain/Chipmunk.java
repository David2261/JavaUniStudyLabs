package com.example.domain;

public class Chipmunk extends Animal implements Pet {

    private String name;

    public Chipmunk() {
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("Бурундучки едят орехи (и играют за них)");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Бурундучки играют только за орехи");
    }
}
