package de.hdm_stuttgart.mi.WichtigeUebungen;

import java.util.Arrays;

public class Median {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 0, -3, 4};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println( "The median is: " + numbers[numbers.length/2]);
    }
}
