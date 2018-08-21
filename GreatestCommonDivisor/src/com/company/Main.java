package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){

        int divisor1 = 1;
        int divisor2 = 1;
        int count = 1;

        if((first<10) || (second<10)){
            return -1;
        }

        for (int i=1; i <100; i++){
            if((divisor1 == 0) && (divisor2 == 0)){
                count = i-1;
            }
            divisor1 = first % i;
            divisor2 = second %i;
        }

//        while ((divisor1 != 0) && (divisor2 !=0)){
//            count--;
//            divisor1 = first % count;
//            divisor2 = second % count;
//        }

        return count;

        }

    }


