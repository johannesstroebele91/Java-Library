package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {

        /* Series of objects having identical type
         * Array consists of array elements
         * Element access by index value
         * Holding either primitive types or object references
         *
         * Tipps
         * Arrays' length CANNOT be changed
         * BUT the existing elements CAN be changed
         * AND the order of the elements
         */

        // INITIALIZATION
        // 1) Way: short 1-step-assignment
        int[] numbers1 = {1,2,3};

        // 2) Way: longer 1-step-assignment
        int[] numbers2 = new int[] {1,2,3};

        // 3) Way: multiple-steps-assignment
        final int[] numbers3 = new int[5];
        numbers3[0] = 2;
        numbers3[1] = 3;
        numbers3[2] = 5;
        numbers3[3] = 7;
        numbers3[4] = 11;
        // numbers3[5] = 11; // index 5 is out of bounds!

        // 4) Wrong Way:
        // C-style array declaration
        // also working but wrong syntax
        int []numbers4 = {1,2,3};

        // ARRAY PARAMETER PASSING
        // 1) Create an array of size 3 on the heap
        // 2) Assign array reference to the array of size 3 on the heap
        int [] lectures = new int [3];
        fill(lectures, 25);
        System.out.println("Second " + lectures[1] + " participant");

        // Index VS Length
        System.out.println(numbers1.length); // Output 3 (-> NOT 2 considering index)
        // numbers1[numbers1.length] = 5; // WRONG! Index 3 out of bounds for length 3
        // numbers1[3] = 5; // Also wrong see above
        numbers1[2] = 5; // RIGHT

        // Print or return NEWLY created array "return (new int[] {1,5,4,3}) "
        System.out.println(Arrays.toString( new int[] {1,2,4} ));
        System.out.println(Arrays.toString( change( new int[] {1,2,4,5,3} )));

        // Return empty array
        // return new int[]{};
        // return new int[0]
    }

    static private void fill(final int[] lectures, final int participants){
        // Array lectures on the heap gets filled with values
        for(int i = 0; i<lectures.length;i++)
            lectures[i] = participants;
    }

    static private int[] change(int [] numbers){
        System.out.println(Arrays.toString(numbers));
        // Return newly created array
        return new int[] {1,5,4,3};
    }
}
