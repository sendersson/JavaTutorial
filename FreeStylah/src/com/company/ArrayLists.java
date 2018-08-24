package com.company;

public class ArrayLists {

    private java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();

    public void addToArrayList(int index){

        arrayList.add(index);

    }

    public void removeFromArrayList(int index){

        arrayList.remove(index);

    }

    public void changeValue(int index, int newValue){

        arrayList.set(index, newValue);

    }

    public void listArrayList(){

        for(int i=0;i < arrayList.size(); i++){
            System.out.println("Element " +(i+1) +": " +arrayList.get(i));
        }

    }

}
