package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'f';

        switch (switchValue) {

            case 'A':
                System.out.println("Testing: " + switchValue);
                break;

            case 'B': case 'b':
                System.out.println("Testing: " +switchValue);
                break;

            case 'C': case 'c':
                System.out.println("Testing: " +switchValue);
                break;

            case 'D': case 'd': case 'E': case 'e': case 'F': case 'f':
                System.out.println("Was d, e or f (" +switchValue +")");
                break;

            default:
                System.out.println("All other choises (" +switchValue +")");
                break;
        }

        String month = "MaY";
        switch (month.toLowerCase()){
            case "may":
                System.out.println("Best month (" +month.toLowerCase() +")");
                break;

             default:
                 System.out.println("Not the best month (" +month.toLowerCase() +")");
        }

    }
}
