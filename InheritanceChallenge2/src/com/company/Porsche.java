package com.company;

public class Porsche extends Car {

    private String model;
    private String engine;

    public Porsche(int speed, int wheels, int gear, boolean stick, String color, String model, String engine) {
        super(speed, wheels, gear, stick, color);
        this.model = model;
        this.engine = engine;
    }

    @Override
    public void honk() {
        System.out.println("Superduper honk!");
        super.honk();
    }
}
