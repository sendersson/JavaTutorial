package com.company;

public class Vehicle {

    private int speed;
    private int wheels;
    private String steering;

    public Vehicle(int speed, int wheels, String steering) {
        this.steering = steering;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void move(int speed){
        System.out.println("Vehicle.move called");
        System.out.println("You moved " +speed*60 +" km");
    }
}
