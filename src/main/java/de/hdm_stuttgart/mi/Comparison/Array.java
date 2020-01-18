package de.hdm_stuttgart.mi.Comparison;

import java.util.Arrays;

public class Array {

    // https://www.geeksforgeeks.org/compare-two-arrays-java/

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 2, 3};

        // 1. Lösungsansatz: "==" -> DOES NOT WORK!!! :///

        if (arr1 == arr2) // Same as arr1.equals(arr2)
            System.out.println("Same"); // False -> weil == flasch vergleicht
        else
            System.out.println("Not same"); // True -> weil == flasch vergleicht

        // 2. Lösungsansatz: -> "Arrays.equals()" -> WORKS :)))

        if (Arrays.equals(arr1, arr2))
            System.out.println("same");
        else
            System.out.println("Not same");
    }
}
