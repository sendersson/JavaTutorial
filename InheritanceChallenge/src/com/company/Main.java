package com.company;

public class Main {

    public static void main(String[] args) {

        Dog doggy = new Dog("Krommis", "Male", true);

        GermanShepherd doggy2 = new GermanShepherd("German Shepherd", "Female", true, true, true);


        doggy2.eating();
        doggy2.bark();

        System.out.println("***************");

        doggy.move();
        doggy.bark();
        doggy.eating();

    }
}
