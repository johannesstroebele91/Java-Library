package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {

        final int[] values = {6, 1, 5, 1, 6, 1};

        // 1) Find Duplicates
        System.out.println( "Are there duplicates? " + searchForDuplicates(values));

        // 2) Purge Duplicates
        System.out.println( "Array without duplicates: " + Arrays.toString(purgeDuplicates(values)));

    }

    // 1) Method for Finding Duplicates
    static private boolean searchForDuplicates(int[] values){

        // a) Sort array
        Arrays.sort(values);

        // b) Find out if there are duplicates
        for(int i = 0; i<values.length-1; i++){
            if(values[i]==values[i+1])
                return true;
        }
    return false;
    }

    // 2) Method for Purging Duplicates
    public static int[] purgeDuplicates (final int[] values) {

        if (0 == values.length) {
            return values; // Special case: Empty array
        }

        // Step 1: Cloning incoming array
        final int[] sortedValues = Arrays.copyOf(values, values.length);

        // Step 2: Sort copied array.
        Arrays.sort(sortedValues);

        // Step 3: Create helper array containing distinct index positions
        final int[] uniqueValuesIndex = new int[values.length];
        int uniqueValueIndexTop = 0;
        uniqueValuesIndex[uniqueValueIndexTop++] = 0; // Include first array element unconditionally

        for (int i = 1; i < sortedValues.length; i++) {
            if (sortedValues[i - 1] != sortedValues[i]) { // current value different from predecessor?
                uniqueValuesIndex[uniqueValueIndexTop++] = i; // Add to set of distinct index values
            }
        }
        // Step 4: Create and copy to result array
        final int[] result = new int[uniqueValueIndexTop]; // We found uniqueValueIndexTop distinct values


        for (int i = 0; i < uniqueValueIndexTop; i++) { // Copy distinct values to result array
            result[i] = sortedValues[uniqueValuesIndex[i]];
        }
        return result;
    }
}
