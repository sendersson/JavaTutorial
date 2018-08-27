package com.company;

public class PropellerPlane extends FlyingMachines{

    private int propellerBlades;

    public PropellerPlane(int wheels, int numberOfEngines, int propellerBlades) {
        super(wheels, numberOfEngines);
        this.propellerBlades = propellerBlades;
    }

    public void fly(){
        System.out.println("Fly you fools!");
    }

    public void attack(){
        System.out.println("Throwing life jackets");
    }

}
