package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class ArrayContainsOtherArray {

    public static void main(String[] args) {

        int[] teil;
        final int[] ganzes;
        // Return true if one Array's elements are in another one
        System.out.println( " Array is in another array contains(new int[]{1}, new int[]{1, 5, 6, 2}: " + contains(new int[]{1}, new int[]{1, 5, 6, 2}));
        System.out.println( " Array is in another array contains(new int[]{1, 5}, new int[]{1, 5, 6, 2}: " + contains(new int[]{1, 5}, new int[]{1, 5, 6, 2}));

        System.out.println( " Array is in another array new int[]{1, 5, 6, 2}, new int[]{5, 6}: " + contains(new int[]{1, 5, 6, 2}, new int[]{5, 6}));

    }

    static public boolean contains(final int[] teil, final int[] ganzes) {

        for (int i = 0; i < ganzes.length - teil.length + 1; i++) {
            if (Arrays.equals(teil, 0, teil.length, ganzes, i, teil.length + i))
                return true;
        }
        return false;
    }
}
