package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        if((firstNumber < 10) || (firstNumber >99) || (secondNumber <10) || (secondNumber > 99)){
            return false;
        }

        int sum1 = firstNumber /10;
        int sum2 = firstNumber %10;
        int sum3 = secondNumber/10;
        int sum4 = secondNumber%10;

        return ((sum1 == sum3) || (sum1 == sum4) || (sum2 == sum3) || (sum2 == sum4));

    }

}
