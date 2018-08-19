package com.company;

public class Main {
private static String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        printYearsAndDays(-525200);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){

        if(minutes <0){
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes / 525600;
            long remainingFromYears = minutes % 525600;

            long days = remainingFromYears / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
