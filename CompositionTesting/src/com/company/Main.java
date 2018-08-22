package com.company;

public class Main {

    public static void main(String[] args) {

        Case theCase = new Case(new Dimensions(10,20), "RoQ 3000", "Asus");
        Processor processor = new Processor("Intel", "i7 9800k", 4, 8);
        Ram ram = new Ram(32, 2700);
        Videocard videocard = new Videocard(8, "1080ti", "Nvidia");

        Computer PC = new Computer(theCase, ram, processor, videocard);

        PC.restart();

        PC.getTheCase().powerUp();

    }
}
