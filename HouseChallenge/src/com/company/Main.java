package com.company;

public class Main {

    public static void main(String[] args) {


        Celler celler = new Celler(true,"400 bottles", 20, 0);
        Attic attic = new Attic(1, 400,16);
        Bathroom bathroom = new Bathroom(2, 42, 3);
        LivingRoom livingRoom = new LivingRoom(4, 2, new Windows(3,20,40), 99);

        House house = new House(livingRoom, bathroom, attic, celler);

        house.goToBathroom();

        System.out.println(house.getCeller().getWine());

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12,"white");

        Bed bed = new Bed("Fancy", 3, 3,2,1);

        Lamp lamp = new Lamp("Fancy", true, 22);

        Bedroom bedroom = new Bedroom(wall1, wall2,wall3,wall4, ceiling, bed, lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
