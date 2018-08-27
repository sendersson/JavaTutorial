package com.company;

import java.util.List;

public class AllaFlyg {

    public void allaFlyger(List<FlyingMachines> flyingMachines){

        for (FlyingMachines flyingMachine : flyingMachines
             ) {
            flyingMachine.fly();
            flyingMachine.attack();
        }

    }

}
