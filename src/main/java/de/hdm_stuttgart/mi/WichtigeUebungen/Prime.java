package de.hdm_stuttgart.mi.WichtigeUebungen;

public class Prime {


    public static void main(String[] args) {

        /** prime number is a whole number
         * greater than 1 whose only factors are 1 and itself
         * e.g.: 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
         */

        System.out.println( "isPrime(2): " + isPrime(2));
        System.out.println( "isPrime(3): " + isPrime(3));
        System.out.println( "isPrime(4): " + isPrime(4));

    }

    private static boolean isPrime(final long candidate) {
        for (long i = 2; i * i < candidate; i++) { // Just test up to square
            if (0 == candidate % i) {                 // root of candidate.
                return false;
            }
        }
        return true;
    }
}
