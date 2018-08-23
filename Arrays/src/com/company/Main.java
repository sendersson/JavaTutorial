package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInteger = getInteger(5);

        int sum = 0;

        for (int i = 0; i < myInteger.length; i++){
            System.out.println(myInteger[i]);
            sum += myInteger[i];
        }
        System.out.println("Average: "+sum /myInteger.length);

    }

    public static int[] getInteger(int number){

        System.out.println("Enter " +number +" integer values\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();

        }

        return values;

    }

}



//ArrayExampleOne.makingArrays();