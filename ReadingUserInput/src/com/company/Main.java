package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year [YYYY]");

        boolean hasNextInt = scanner.hasNextInt(); // Checks the input for numbers

        if(hasNextInt){ //

            int age = 2018-scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if(age >= 0 && age <=100 ){
                System.out.println("Your name is " +name +" and you are " +age +" years old.");
            } else {
                System.out.println("Invalid year of birth-");
            }
        }else {
            System.out.println("Unable to parse your of birth.");
        }


        scanner.close();

    }
}
