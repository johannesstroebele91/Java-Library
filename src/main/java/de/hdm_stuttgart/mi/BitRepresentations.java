package de.hdm_stuttgart.mi;

public class BitRepresentations {

    public static void main(String[] args) {

        // Print out bit representation
        System.out.println("35 as Binary (Base 2):       " + Integer.toString(35, 2));
        System.out.println("35 as Ternary (Base 3):      " + Integer.toString(35, 3));
        System.out.println("35 as Octal (Base 8):        " + Integer.toString(35, 8));
        System.out.println("35 as Hexadecimal (Base 16): " + Integer.toString(35, 16));

        /* 3 bit representation
         * 001 → einfachste Beispiel → von rechts nur 1 Zahl: 1*2/0 = 1
         * 010 → 0*2^0 + 1*2^1 + 0*2^2  = 2
         * 100 → 0*2^0 + 0*2^1 + 1*2^2 = 4
         * 111 → = 7 → max value of 3 bit integers
         */

        /* Convert decimal -4 to 3 bit two complement rule
         * 1. start from positive value → 4 —> 100
         * 2. invert bits → 011
         * 3. add 001 to 011
         *   011 →  3
         * + 001 → +1
         *=  100 →  4
         */

        /* Signed 8 bit integer binary representation
         * -128 -> 10000000 -> -2^(8-1)
         * 0    -> 00000000 ->
         * 127  -> 01111111 -> 2^(8-1)-1
         */

        /* Berechnung: Negative 8 bit representation
         * Stelle den Betrag der Zahl binär dar → positive Zahl 42
         *- 0: 0*2^0
         *- 1: 1*2^1 = 2
         *- 0: 0*2^2 = 0
         *- 1:  1*2^3 = 8
         *- 0: 0
         *- 1: 1*2^5 = 32
         *- 0:
         *- 0:
         *= Somit ist 42: 0010 1010
         * Bilde das Komplementär (alle Bits kippen)
         *= 11010101
         * Binär 1 dazu addieren: (für negativ)
         *   1101 0101
         * + 0000 0001
         * ———————————
         *= 1101 0110 → Ergebnis
         */

    }
}
