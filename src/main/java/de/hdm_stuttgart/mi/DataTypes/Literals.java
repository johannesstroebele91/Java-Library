package de.hdm_stuttgart.mi.DataTypes;

public class Literals {
    public static void main(String[] args) {

        System.out.println("Hello");     // A String literal
        System.out.println(33452);       // An int literal
        System.out.println(34.0223);     // A double (floating point) literal
        System.out.println(2147483648L); // A long literal


        /* Literal: 29
         * Discrimator: base 10
         * Decimal
         * 2 * 10^1 + 9 * 10^0
         */

        /* Literal: 0b11101
         * Discrimator: 0b, base 2
         * Binary
         * 1 * 2^4 + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0
         */

        /* Literal: 0x1D
         * Discrimator: 0x, base 16
         * Hexadecimal
         * 1 * 16^1 + 13 * 16^0
         */

        /* Literal: 035
         * Discrimator: 0, base 8
         * Octal
         * 3* 8^1 + 5 * 8^0
         */
    }
}
