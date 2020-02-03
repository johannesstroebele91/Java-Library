package de.hdm_stuttgart.mi.WichtigeUebungen;

public class Factorial {

    // Factorial without recursion
    // 4! = 4*3*2*1 = 24

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorial(9));
    }

    private static long factorial(int number){

        long result = number;
        for (int i = number; i > 1; i--) {
            number--;

            result = result * number;
        }

        return result;
    }
}
