package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = true;
        int pressed = 0;

        printInstructions();
        while (quit){

            System.out.println("Enter your choice:");

            pressed = scanner.nextInt();
            scanner.nextLine();

            switch (pressed){
                case 1:
                    addGroceryItem();
                    break;
                case 2:
                    listGroceryItems();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit = false;
                    break;
                default:
                    printInstructions();
            }

        }
        scanner.close();
    }

    private static void addGroceryItem(){
        System.out.println("Type in item name:");
        String itemName = scanner.nextLine();
        groceryList.addGroceryItem(itemName);
    }
    private static void listGroceryItems(){
        groceryList.printGroceryList();
    }
    private static void modifyItem(){
        System.out.println("Position: ");
        int position = scanner.nextInt()-1;
        scanner.nextLine();
        if(position >= groceryList.size()){
            System.out.println("Invalid position");
        } else {
            System.out.println("New item: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryItem(position, newItem);
        }
    }
    private static void removeItem(){
        System.out.println("Position: ");
        int position2 = scanner.nextInt()-1;
        scanner.nextLine();
        if(position2 >= groceryList.size()){
            System.out.println("Invalid position");
        } else {
            groceryList.removeGroceryItem(position2);
        }
    }
    private static void findItem(){
        System.out.println("Name of item: ");
        String searchedItem = scanner.nextLine();
        if(groceryList.findItem(searchedItem) != null){
            System.out.println("Found " +searchedItem +" in your grocery list");
        } else {
            System.out.println("Item not found");
        }

    }

    private static void printInstructions(){
        System.out.println("Press:");
        System.out.println("1. Add a grocery item");
        System.out.println("2. Printing grocery list");
        System.out.println("3. Modify item");
        System.out.println("4. Remove item");
        System.out.println("5. Search item");
        System.out.println("6. Quit");
        System.out.println("Any other key to print instructions");
    }

}
