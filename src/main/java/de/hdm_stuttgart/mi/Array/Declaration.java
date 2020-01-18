package de.hdm_stuttgart.mi.Array;

public class Declaration {

    public static void main(String[] args) {

        // 3 ways to initialize an array
        int[] numbers1 = {1,2,3};
        int[] numbers2 = new int[] {1,2,3};

        int[] numbers3 = new int[5];
        numbers3[5] = 1; // WRONG: 5 is OUT OF BOUNDS!!!
        numbers3[4] = 1; // RIGHT: 4 is IN BOUNDS!!!

        // WRONG: C-style array declaration -> also working but wrong syntax
        int numbers4[] = {1,2,3};
    }
}
