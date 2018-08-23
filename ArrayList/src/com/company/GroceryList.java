package com.company;

import java.util.ArrayList;

class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    void addGroceryItem(String item) {
        groceryList.add(item);
    }

    void printGroceryList() {
        System.out.println("You have: " + groceryList.size() + " items in your cart.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Position " + position + 1 + " has been modified to: " + newItem);
    }

    void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
    int size(){
        return groceryList.size();
    }

}
