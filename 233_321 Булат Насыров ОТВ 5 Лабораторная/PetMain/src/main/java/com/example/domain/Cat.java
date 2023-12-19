package com.example.domain;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        this("Мурка");
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
        System.out.println(this.name + " любит играть с веревочкой!");
    }

    @Override
    public void eat() {
        System.out.println("Кошки любят есть пауков и рыбок");
    }
}
