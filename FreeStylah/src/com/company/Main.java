package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static ArrayLists arrayLists = new ArrayLists();

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        // regular array to arraylist

        int[] array = userInputToArray(2);
        System.out.println(Arrays.toString(array));

        int[] autoFilledArray = autoFillArray(10);
        System.out.println(Arrays.toString(autoFilledArray));

        arrayToArrayList(autoFilledArray);

        arrayToArrayList(array);

        arrayLists.listArrayList();
    }

    public static int[] autoFillArray(int elements){

        int[] array = new int[elements];
        for (int i =0; i < elements; i++){
            array[i] = i*10;
        }
        return array;
    }

    public static int[] userInputToArray(int elements){

        System.out.println("Enter " +elements +" numbers: \r");

        int[] array = new int[elements];
        for (int i = 0; i < elements; i++){
            System.out.println(i+1 +":");
            array[i] = s.nextInt();
        }
        s.close();
        return array;

    }

    public static void arrayToArrayList(int[] array){

        for (int i = 0; i < array.length; i++){
            int numberToAdd = array[i];
            arrayLists.addToArrayList(numberToAdd);
        }

    }
}
