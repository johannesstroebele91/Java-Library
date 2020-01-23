package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {

        final int[] values = {6, 1, 5, 1, 6, 1};

        // final int[] valuesSorted = Arrays.sort(values); // Wrong! next line for solution
        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

        System.out.println("Are there duplicates? " + searchForDuplicates(values));
    }
    static private boolean searchForDuplicates(int[] values){
        for(int i = 0; i<values.length-1; i++){
            if(values[i]==values[i+1])
                return true;
        }
    return false;
    }
}
