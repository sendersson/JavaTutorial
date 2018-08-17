package com.company;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20;
        double secondDouble = 80;
        double bothCombined = (firstDouble+secondDouble)*25;
        double remainder = bothCombined % 40;

        if(remainder <= 20)
            System.out.println("Total was over the limit");
        else System.out.println("Guess not...");

    }
}
