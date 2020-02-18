package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class SearchForElementInArray {

    public static void main(String[] args) {

        int intArr[] = {10,20,15,22,35};
        final String[] names = {"Eve", "Aaron", "Paul", "Mandy"};

        // Arrays.binarySearch() -> IMPORTANT, sort FIRST!
        // IMPORTANT! Array must be SORTED prior to do Arrays.binarySearch()
        // https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/
        Arrays.sort(names);
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(intArr, 20));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(intArr, 35));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Eve")); // Output: 1 -> 1. Stelle im Array
        // "Aaron", "Eve", "Mandy", "Paul"
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Mand"));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Mandy")); // Output: 2 -> 2. Stelle im Array
        System.out.println("Arrays.binarySearch: " + ((Arrays.binarySearch(names, "Mandyer")) < -1 ? "false" : Arrays.binarySearch(names, "Mandyer")));
        // Manuel search
        System.out.println("Manuel int search: " + ((searchString("Mandy", names)) == (-1) ? "false" : searchString("Mandy", names)));
        System.out.println("Manuel int search: " + ((searchString("Mandy23", names)) == (-1) ? "false" : searchString("Mandy", names)));
    }

    static public int searchString(String searchedInt, String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (searchedInt.equals(names[i]))
                return i;
        }
        return -1;
    }
}
