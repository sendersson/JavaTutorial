package com.company;

public class ArrayExampleOne {

    public static void makingArrays() {

        //Skapar en tom array med 10 element och hardcodar int:
        int[] myIntArray = new int[9];
        myIntArray[5] = 4321;

        //Om man vill fylla den direkt och arrayen blir så stor som antal inputs det är:
        int[] filledArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Går bara att göra vid init

        //Fylla den med hjälp av en for loop:
        int[] forLoopArray = new int[40];

        for (int i = 0; i < forLoopArray.length; i++) {
            forLoopArray[i] = i * 10;
        }
        printArray(forLoopArray);
    }
    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println("Element: " +i +" in array is: " +array[i]);
        }

    }

}



