package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class CopyArrayToOther {

    public static void main(String[] args) {

        // How to copy one array to another one
        // https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java

        int[] arr = {1,2,3,4};

        System.out.println( Arrays.toString( take(arr, 3 ) ));
        System.out.println( Arrays.toString( take2(arr, 3 ) ));

    }

    // Manuel Solution
    public static int[] take(int[] arr, int n) {

        // 1. Code Edge Cases
        if (n < 0){
            n = 0;
        }
        else if (n > arr.length){
            n = arr.length;
        }
        // 2. Only then, code Solutionn
        int[] array = new int[n];
        for( int i = 0; i < n; i++ ) {
            array[i] = arr[i];
        }
        return array;
    }

    // Short Solution
    public static int[] take2(int[] arr, int n) {

        if (n < 0){
            n = 0;
        }
        else if (n > arr.length){
            n = arr.length;
        }
        int[] array = new int[n];
        System.arraycopy(arr, 0, array, 0, n);
        return array;
    }
}
