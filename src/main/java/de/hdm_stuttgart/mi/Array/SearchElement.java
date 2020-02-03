package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class SearchElement {

    public static void main(String[] args) {

        // https://www.baeldung.com/java-binary-search

        int [] numbers = {9,3,2,4,1};

        // 1) The array needs to be SORTED before a binary search
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4, 9]

        // 2) Do Binary Search
        System.out.println(Arrays.binarySearch(numbers, 3)); // Output 2
        // Therefore, the key "3" is at the index 2
    }
}
