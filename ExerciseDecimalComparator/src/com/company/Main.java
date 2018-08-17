package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber *= 1000;
        secondNumber *= 1000;

        int num1 = (int) firstNumber;
        int num2 = (int) secondNumber;

        return num1 == num2;

    }
}
