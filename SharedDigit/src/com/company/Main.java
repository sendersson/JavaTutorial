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

        int sum1 = ;

        while (firstNumber > 0){
            int digit = firstNumber % 10;
            sum1 += digit;

            firstNumber /= 10;
        }





    }

}
