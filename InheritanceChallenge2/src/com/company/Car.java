package com.company;

public class Car extends Vehicle {

    private int gear;
    private boolean stick;
    private String color;

    public Car(int speed, int wheels, int gear, boolean stick, String color) {
        super(speed, wheels);
        this.gear = gear;
        this.stick = stick;
        this.color = color;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() called");
        super.move(speed);
    }

    public void honk(){
        System.out.println("Honkely! ");
    }
}
