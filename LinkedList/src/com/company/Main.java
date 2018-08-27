package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        addInOrder(linkedList, "Bagarmossen");
        addInOrder(linkedList, "Gullmarsplan");
        addInOrder(linkedList, "Kärrtorp");

        printThePlaces(linkedList);

    }

    static void printThePlaces(LinkedList<String> placesToVisit){

        Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting: " +i.next());
        }
        System.out.println("*******************");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newPlace){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newPlace);
            if (comparison == 0){
                System.out.println(newPlace +" already in the list");
                return false;
            } else if(comparison >0){
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                return true;
            } else if (comparison<0){

            }
        }
        stringListIterator.add(newPlace);
        return true;
    }

}
