package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<FlyingMachines> machines = new ArrayList<FlyingMachines>();
        machines.add(new FlyingMachines(4,2));
        machines.add(new PropellerPlane(3,2,4));
        machines.add(new ApacheHelicopter(3,1,2,2));

        new AllaFlyg().allaFlyger(machines);

    }
}
