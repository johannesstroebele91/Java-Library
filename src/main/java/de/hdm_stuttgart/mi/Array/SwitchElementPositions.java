package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class SwitchElementPositions {

    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 3, 4};
        int[] arr2 = {23, 1, 10, 3, 4, 43, 2};

        System.out.println( "Sort array: " + Arrays.toString(switchPosition(arr)));
        System.out.println( "Sort array: " + Arrays.toString(switchPosition(arr2)));

    }

    static private int[] switchPosition(int[] arr) {
        if (arr.length == 1)
            return arr;
        else {
            int tempFirstElement = arr[0];
            for (int i = 0; i < (arr.length); i++) {
                arr[i] = arr[arr.length - i - 1];
            }
            arr[arr.length - 1] = tempFirstElement;
            return arr;
        }
    }
}
