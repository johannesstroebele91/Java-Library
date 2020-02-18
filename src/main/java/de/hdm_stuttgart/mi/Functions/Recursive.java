package de.hdm_stuttgart.mi.Functions;

public class Recursive {

    // Factorial of n is the product of all positive descending integers
    // 4! = 4*3*2*1 = 24
    // Therefore, a perfect example with recursion is possible:

    public static void main(String[] args) {

        System.out.println( "factorialRecurse(3) " + factorialRecurse(3));
        System.out.println( "factorialRecurse(7) " + factorialRecurse(7));
        System.out.println( "factorialRecurse(23) " + factorialRecurse(23));

        // Short solution
        System.out.println( "factorialRecurse(23) " + factorialShort(23));
    }

    static public long factorialRecurse(int n) {
        if (0 == n) {
            return 1;                           // Termination condition
        } else {
            return n * factorialRecurse(n - 1); // Reducing step: n! = n * (n - 1)!
        }
    }

    // Short solution
    static private long factorialShort(int n) {
        return 0 == n ? 1: n * factorialShort(n - 1);
    }
}
