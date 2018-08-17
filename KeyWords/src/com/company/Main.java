package com.company;

public class Main {

    public static void main(String[] args) {

        Gooddog hund1 = new Gooddog();
        hund1.setSize(45);
        hund1.setPetable(true);
        System.out.println(hund1.getSize());
        hund1.bark();
        hund1.pet();

        Gooddog hund2 = new Gooddog();
        hund2.setSize(70);
        hund2.setPetable(false);
        System.out.println(hund2.getSize());
        hund2.bark();
        hund2.pet();

        Gooddog hund3 = new Gooddog();
        hund3.setSize(10);
        hund3.setPetable(true);
        System.out.println(hund3.getSize());
        hund3.bark();
        hund3.pet();

    }
}
