package com.JohnT;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        addInOrder(placeToVisit, "Sydney");
        addInOrder(placeToVisit, "Melbourne");
        addInOrder(placeToVisit, "Brisbane");
        addInOrder(placeToVisit, "Perth");
        addInOrder(placeToVisit, "Canberra");
        addInOrder(placeToVisit, "Adelaide");
        addInOrder(placeToVisit, "Darwin");

        printList(placeToVisit);

        addInOrder(placeToVisit, "Alice Springs");
        addInOrder(placeToVisit, "Darwin");
        printList(placeToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {

        //Iterator
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {

            //after the initial setup, we need to use the next() method to make the listiterator point to the first entry
            int comparision = stringListIterator.next().compareTo(newCity);

            if (comparision == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included a destination");
                return false;
            } else if (comparision > 0) {
                //new city should appear before this one
                //Brisbane -> Sydeny
                //Move the pointer backward because at this time, the pointer already at the next position
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                //move to next city

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No Cities in the iter");
        }
    }









}
