package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Corgi", 1,3,4,5,6,1,"Furry");

        dog.walk();
        dog.run();

        Cat cat = new Cat("Garfield", 1, 1, 20, 40,1,1,1);

    }
}
