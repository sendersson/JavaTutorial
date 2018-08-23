package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Om man använter Integer classen istället för vanliga int[]
        // så kan man använda methoderna Arrays.sort och Collections.reverseOrder

        Integer[] newArray = new Integer[]{14,12,33,70,50};
        sortedWithCollections(newArray);
        for (int i=0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }


       // int[] myArray = getInteger(5);
       // printArray(myArray);
       // int[] sortedArray = sortInteger(myArray);
       // printArray(sortedArray);

    }

    public static int[] getInteger(int numberOfElements) {

        int[] array = new int[numberOfElements];

        System.out.println("Enter " + numberOfElements + " numbers: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Printing array: \r");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "s value is: " + array[i]);
        }
    }

    public static int[] sortInteger(int[] array) {

        //int[] sortedArray = new int[array.length];
        //for (int i = 0; i < array.length; i++) {
        //    sortedArray[i] = array[i];
        //}

        // Enklare sätt att kopiera en array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void sortedWithCollections(Integer[] array){

        Arrays.sort(array, Collections.reverseOrder());


    }

}


// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.