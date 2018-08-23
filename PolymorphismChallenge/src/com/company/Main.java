package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car class: Starting Engine";
    }
    public String accelerate(){
        return "Car class: Accelerate (Brum... Bruuuum";
    }
    public String brake(){
        return "Car class: Braking (in a cool way)";
    }
}

class Porsche extends Car{
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" class: Start brummelibrumm!";
    }
}

class Volvo extends Car {
    public Volvo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" class: We don't need roads!";
    }
}

class Camero extends Car{
    public Camero(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" class: Breeeesladd!";
    }
}

class Lådbil extends Car{
    public Lådbil(String name, int cylinders) {
        super(name, cylinders);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Volvo("V90", 8);
        System.out.println(car1.getName());
        System.out.println(car1.getCylinders());
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        Car car2 = new Lådbil("Lådis",0);
        System.out.println(car2.getName());
        System.out.println(car2.getCylinders());
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

    }
}

/*
class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark ears lots of people";
    }
}
*/


// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).