package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class TwoDimensional {

    public static void main(String[] args) {

        // 1. Möglichkeit
        // [x][] = row
        // [][x] = col
        final int[][] matrix = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = col + row;
            }
        }
        for (int row = 0; row < 2; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

        final int[][] matrix1 = new int[2][];

        // 2. Möglichkeit
        matrix[0] = new int[] {1,2,5};
        matrix[1] = new int[] {3,5,7};
        // matrix[2] = new int[] {1,2,5}; -> out of bounds!!!

        // 3. Möglichkeit
        final int[][] matrix2 = {
            {1,2,3},
            {4,5,6}};
    }
}
