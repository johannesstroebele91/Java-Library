package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class Printing {
    public static void main(String[] args) {

        // Examples from: https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
        String[] array = new String[] {"John", "Mary", "Bob"};
        double[] doubleArray = { 7.0, 9.0, 5.0, 1.0, 3.0 };
        int[] intArray = { 7, 9, 5, 1, 3 };

        // 1) Simplest solution for 1-dimensional Array
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(intArray));

        // 2) Simplest solution for 1-dimensional Array
        for(String i: array)
            System.out.println(i);
        for(double i: doubleArray)
            System.out.println(i);

        // Solution for 2-dimensional (nested) Array
        String[][] twoDimArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        // WRONG: using .toString() -> bad output
        System.out.println(Arrays.toString(twoDimArray)); //output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
        // CORRECT: .deepToString()
        System.out.println(Arrays.deepToString(twoDimArray)); // Output: [[John, Mary], [Alice, Bob]]

        // 3) Printing the args String Array of the main Function
        System.out.println("String");
        for(int i = 0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}
