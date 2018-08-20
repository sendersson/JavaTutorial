package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));

        // Olika sätt att göra samma sak:

        int count = 1;
        while (count != 11){
            System.out.println("Count value is: " +count);
            count++;
        }

        System.out.println("******************");

        count = 0; // Måste nollställas

        // Vanlig forever-loop som måste ha en break och en increment
        while (true){
            if(count == 10){
                break;
            }
            count++;
            System.out.println("Count value is: " +count);
        }

        System.out.println("******************");

        // for(int i=1; i<11; i++)
        for(count=1; count <11; count++){
            System.out.println("Count value is: " +count);
        }

        System.out.println("******************");

        count = 6;
        do {
            System.out.println("Count value is: " +count);
            count++;
            if(count >100){
                break;
            }
        } while (count != 6);

        int number =4;
        int finishNumber =20;
        count = 0;
        int sum = 0;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            if(count == 5){
                break;
            }
            sum += number;
            count++;
            System.out.println("Even number: " +number);
        }
        System.out.println("The sum of all even numbers are: " +sum);
        System.out.println("Number of even numbers are: " +count);
    }

    public static boolean isEvenNumber(int number){

        return ((number % 2) == 0);

    }


    }

