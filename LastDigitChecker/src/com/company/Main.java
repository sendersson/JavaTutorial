package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        if((number1 < 10) || (number2 <10) || (number3 <10) || (number1>1000) || (number2>1000) || (number3 >1000)){
            return false;
        }

        int sum1 = number1 %10;
        int sum2 = number2 %10;
        int sum3 = number3 %10;

        return ((sum1 == sum2) || (sum1 == sum3) || (sum2 == sum3));

    }

}
