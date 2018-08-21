package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Porsche bil1 = new Porsche(50,4,1,true,"green", "Carrera", "V8");

        bil1.honk();

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv nåt: ");
        scan.nextLine();
    }
}
