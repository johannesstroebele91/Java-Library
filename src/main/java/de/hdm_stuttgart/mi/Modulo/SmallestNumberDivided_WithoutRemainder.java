package de.hdm_stuttgart.mi.Modulo;

public class SmallestNumberDivided_WithoutRemainder {

    public static void main(String[] args) {

        // smallest number that can be divided by
        // each of the numbers from 1 to 20
        // without any remainder

        final int highestDivisor = 20;             // May be adjusted to other limits.

        int candidate = highestDivisor;            // start with highest divisor.

        boolean atLeastOneRemainder;

        do {
            candidate++;                            // next candidate value.
            atLeastOneRemainder = false;

            for (int i = 2; i <= highestDivisor; i++) {
                if (0 != candidate % i) {            // Is there a non-zero remainder?
                    atLeastOneRemainder = true;       // Continue outer while.
                    break;                            // Leave current for loop.
                }
            }

        } while (atLeastOneRemainder);             // Increase candidate further?

        System.out.println(candidate);
    }
}
