package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone willes;
        willes = new DeskPhone(1234567);
        willes.powerOn();
        willes.answer();

        willes = new MobilePhone(1234567);
        // willes.powerOn();
        willes.callPhone(12345);
        willes.answer();

    }
}
