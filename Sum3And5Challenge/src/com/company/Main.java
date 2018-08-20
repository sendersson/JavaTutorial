package com.company;

public class Main {

    public static void main(String[] args) {

        int total = 0;
        int counter = 0;

        for(int i=1; i <=1000; i++){
           if((i%3 == 0) && (i%5 == 0)){
                counter++;
                System.out.println(i +" is divided by 3 and 5");
                total += i;
                if(counter == 5){
                    System.out.println("Total added up: " +total);
                    break;
                }
            }


        }

    }
}
