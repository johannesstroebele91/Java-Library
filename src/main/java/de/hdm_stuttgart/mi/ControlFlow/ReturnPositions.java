package de.hdm_stuttgart.mi.ControlFlow;

import java.util.Arrays;

public class ReturnPositions {

    public static void main(String[] args) {

        // Using return correctly in unorthodox cases
        final int[] values = {6, 1, 5, 1, 6, 1};
        Arrays.sort(values);
        System.out.println("Are there duplicates? " + searchForDuplicates(values));
    }
    static private boolean searchForDuplicates(int[] values){
        for(int i = 0; i<values.length; i++){
            if(values[i]==values[i+1])
                return true;
        }
        return false;

    }
}
