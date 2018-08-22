package com.company;

public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20,20,5);
        //Resolution nativeResolution = new Resolution(1920, 1080); Så kan man göra men funkar att göra:
        Monitor theMonitor = new Monitor("Sync master 3000", "Acer", 32, new Resolution(2540, 1440));
        Case theCase = new Case("Game master 3000", "Samsung", "700w", dimensions);
        Motherboard theMotherboard = new Motherboard("A97", "Asus", 4, 6, "Legacy");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
    }
}
