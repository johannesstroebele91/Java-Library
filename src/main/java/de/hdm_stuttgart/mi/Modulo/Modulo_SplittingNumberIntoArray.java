package de.hdm_stuttgart.mi.Modulo;

import java.util.Arrays;

public class Modulo_SplittingNumberIntoArray {

    public static void main(String[] args) {

        // Exam WS 2017 Helper "dezimalZerlegung"
        // Breaking down a value into an array of ones, tens, hundreds
        // e.g. 123 -> int[] result = {3, 20, 100}

        System.out.println(Arrays.toString( modulo(297)) );

    }

    private static long[] modulo(int input) {

        long[] result = new long[String.valueOf(input).length()];

        for (int i = 0; i < String.valueOf(input).length(); i++)
            result[i] = Math.round(input % Math.pow(10, i+1)) / Math.round(Math.pow(10, i));
        return result;
    }

}