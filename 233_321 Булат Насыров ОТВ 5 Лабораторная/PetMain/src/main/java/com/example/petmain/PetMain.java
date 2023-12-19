package com.example;

import com.example.domain.Animal;
import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Spider;
import com.example.domain.Pet;
import com.example.domain.Chipmunk;


public class PetMain {
    public static void main(String[] args) {
        Animal animal;

        Spider spider = new Spider();
        spider.walk();
        spider.eat();
        System.out.println();

        Cat cat = new Cat("Том");
        cat.walk();
        cat.eat();
        System.out.println();

        animal = new Cat();
        animal.walk();
        cat.eat();
        System.out.println();

        Fish fish = new Fish();
        fish.setName("Гуппи");
        fish.walk();
        fish.eat();
        System.out.println();

        animal = new Fish();
        animal.walk();
        animal.eat();
        System.out.println();

        Chipmunk chipmunk = new Chipmunk ();
        chipmunk.walk();
        chipmunk.eat();
        System.out.println();

        playWithAnimal(cat);
        playWithAnimal(spider);
        playWithAnimal(fish);
        playWithAnimal(chipmunk);

    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Опасно, дикое животное");
        }
    }
}
