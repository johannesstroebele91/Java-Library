package de.hdm_stuttgart.mi.Operators;

import java.util.Arrays;

public class Modulo_Beispiel {

    // Siehe Exam WS 2017

    public static long[] modulo(int input) {

        long[] result = new long[String.valueOf(input).length()];

        for (int i = 0; i < String.valueOf(input).length(); i++)
            result[i] = Math.round(input % Math.pow(10, i+1)) / Math.round(Math.pow(10, i));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString( modulo(297)) );

    }
}