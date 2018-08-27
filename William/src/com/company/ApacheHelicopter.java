package com.company;

public class ApacheHelicopter extends FlyingMachines {

    private int guns;
    private int missiles;

    public ApacheHelicopter(int wheels, int numberOfEngines, int guns, int missiles) {
        super(wheels, numberOfEngines);
        this.guns = guns;
        this.missiles = missiles;
    }

    public void fly(){
        System.out.println("Straight up!");
    }

    public void attack(){
        System.out.println("Pew pew pew!!!");
    }

}
