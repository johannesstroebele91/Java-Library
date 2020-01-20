package de.hdm_stuttgart.mi.Functions;

public class Recursive {

    public static void main(String[] args) {

        System.out.println( "factorialRecurse(3) " + factorialRecurse(3));
        System.out.println( "factorialRecurse(7) " + factorialRecurse(7));
        System.out.println( "factorialRecurse(23) " + factorialRecurse(23));
    }

    static public long factorialRecurse(int n) {
        if (0 == n) {
            return 1;                           // Termination condition
        } else {
            return n * factorialRecurse(n - 1); // Reducing step: n! = n * (n - 1)!
        }
    }
}
