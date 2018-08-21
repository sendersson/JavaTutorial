package com.company;

public class Cat extends Animal {

    private int laserBeam;
    private int bazookas;
    private int rubicCubes;

    public Cat(String name, int brain, int body, int size, int weight, int laserBeam, int bazookas, int rubicCubes) {
        super(name, brain, body, size, weight);
        this.laserBeam = laserBeam;
        this.bazookas = bazookas;
        this.rubicCubes = rubicCubes;
    }
}
