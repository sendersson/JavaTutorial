package com.company;

public class Main {
/*
    Write a method with the name sumDigits that has one int parameter called number.
    If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
    The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.
    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    Calling the method sumDigits(1) should return -1 as per requirements described above.
    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.

            Hint:
    Use n % 10 to extract the least-significant digit.
    Use n = n / 10 to discard the least-significant digit.
    The method needs to be static like other methods so far in the course.

  */
    public static void main(String[] args) {

        System.out.println(sumDigits(725));
        System.out.println(sumDigitsWithWhileLoop(10725555));

    }

    private static int sumDigits(int number){

        if(number <=9){
            return -1;
        }

        int hundreds = number/100;
        int remainingAfterHundreds = number%100;

        int tens = remainingAfterHundreds/10;
        int ones = remainingAfterHundreds%10;

        return hundreds+tens+ones;
    }

    private static int sumDigitsWithWhileLoop(int number){

        if(number <10){
            return -1;
        }

        int sum = 0;

        // Man skalar bort siffran längst till höger med %10 och sen delar man med 10:
        // 12345 %10 = 5 > sum
        // 12345 /10 = 1234
        // 1234 %10 = 4 > sum
        // 1234 /10 = 123
        // 123 %10 = 3 > sum
        // 123 /10 = 12
        // 12 %10 = 2 > sum
        // 12 /10 = 1
        // 1 %10 = 0 > sum
        // 0 /10 = 0
        // sum = 5 + 4 +3 +2 +1 +0: 15


        while (number > 0){
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }

}
