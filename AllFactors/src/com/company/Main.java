package com.company;

public class Main {

    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number){

        if(number <0){
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i < number+1; i++) {
                if ((number % i) == 0) {
                    System.out.println(i + " ");
                }
            }

        }
    }

}
