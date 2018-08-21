package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int max = Integer.MIN_VALUE;
        //int min = Integer.MAX_VALUE;

        int max = 0;
        int min = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter a number :");

            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                System.out.println("Invalid value");
                System.out.println("Max number: " + max);
                System.out.println("Min number: " + min);
                break;
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close();
    }
}
