package com.company;

public class FlyingMachines {

    private int wheels;
    private int numberOfEngines;

    public FlyingMachines(int wheels, int numberOfEngines) {
        this.wheels = wheels;
        this.numberOfEngines = numberOfEngines;
    }

    public void fly(){
        System.out.println("Lift off");
    }

    public void attack(){
        System.out.println("Does'nt have any guns :S");
    }

}
