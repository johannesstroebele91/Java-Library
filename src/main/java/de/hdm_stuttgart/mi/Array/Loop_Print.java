package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class Loop_Print {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        // LOOP
        // 1) For
        // Warning: index starts at 0
        // length starts at 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2) For-each:
        // Warning: VALUE! not index
        System.out.println("\nFor-each?");
        for (int number : numbers) {
            System.out.println(number);
        }

        // PRINT
        // Examples from: https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
        double[] doubleArray = { 7.0, 9.0, 5.0, 1.0, 3.0 };

        // 1) Simplest solution for 1-dimensional Array
        System.out.println(java.util.Arrays.toString(doubleArray));

        // 2) Simplest solution for 1-dimensional Array
        for(double i: doubleArray)
            System.out.println(i);

        // Solution for 2-dimensional (nested) Array: ".deepToString()"
        String[][] twoDimArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(java.util.Arrays.toString(twoDimArray));       // WRONG: using .toString() -> Output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
        System.out.println(Arrays.deepToString(twoDimArray));   // CORRECT: using .deepToString() -> Output: [[John, Mary], [Alice, Bob]]

    }
}
