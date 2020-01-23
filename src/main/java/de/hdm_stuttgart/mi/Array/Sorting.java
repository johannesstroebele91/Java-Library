package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Sorting {

    public static void main(String[] args) {

        /** Sorting:
         1) ascending with Arrays.sort()
         2) descending with Arrays.sort(someArray, Collections.reverseOrder());
         3) descending manually
         */
        // Test cases
        int[] arr1 = {10, 2, 1};
        int[] arr2 = {10, 2, 1,2,4};
        int[] arr3 = {1};
        int[] arr4 = {1,5,7,3,-4,2,10,100,20};


        // Sorting arrays
        print(arr1);
        print(arr2);
        print(arr3);
        print(arr4);

        // Sorting
    }

    private static int sum;
    private static int tempElement = 0;
    Integer iInteger;

    // 1) Ascending sorting with Arrays.sort()
    static public void sortAscending(int[] arr) {
        if(arr.length == 1 || arr.length == 0)
            System.out.println("The array is too short for sorting");
        else {
            // int[] arrNew = Arrays.sort(values); // Wrong!!! next line for solution
            Arrays.sort(arr);
            System.out.println("Array in ascending order: " + Arrays.toString(arr));
        }
    }

    // 2) Descending with " Arrays.sort(someArray, Collections.reverseOrder()) "
    static public void sortDescendingCollections(int[] arr) {

        // Descending sorting possible with: Arrays.sort(someObject, Collections.reverseOrder());
        // HOWEVER, because not an int[], but a Object ist needed
        // First, a conversion from int[] to Integer is necessary
        // Reference: https://stackoverflow.com/questions/1694751/java-array-sort-descending
        Integer[] integerArray = IntStream.of( arr ).boxed().toArray( Integer[]::new );
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(arr));
    }


    // 3) Descending manually
    static public void sortDescendingManually(int[] arr){
        if (arr.length == 1)
            return;
        else {
            for (int j = 0; j < arr.length - 1; j++) {
                // System.out.println("j: " + j);
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        tempElement = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tempElement;
                    }
                }
            }
        }
        System.out.println("Array in descending order: " + Arrays.toString(arr) + "\n");
    }

    public static void print(int[] arr){
        System.out.println("Array:\nMaximum value is " + Arrays.stream(arr).max() + " and length is " + arr.length);
        sortAscending(arr);
        sortDescendingCollections(arr);
        sortDescendingManually(arr);
    }
}
