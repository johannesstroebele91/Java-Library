package de.hdm_stuttgart.mi.Array;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/arraylist-in-java/

        /** ARRAY LISTS
         * are dynamic arrays in Java
         * slower than standard arrays
         * but can be helpful in programs
         * where lots of manipulation in the array is needed
         */

        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrlist = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrlist.add(i);

        // Printing elements
        System.out.println(arrlist);

        // Remove element at index 3
        arrlist.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrlist);

        // Accessing elements via index one by one
        for (int i=0; i<arrlist.size(); i++)
            System.out.print(arrlist.get(i)+" ");

        // Accessing elements one by one
        for (int a: arrlist) {
            System.out.println(a);
        }
    }


}
