package de.hdm_stuttgart.mi.WichtigeUebungen;

public class GreatestCommonDivisor {

    // Solutions:
    // Greatest Common Divisor
    // Least Common Multiple


    public static void main(String[] args) {
        System.out.println( "getGcd(235,323) " + getGcd(235,323));
        System.out.println( "getGcd(42,78) " + getGcd(42,78));
        System.out.println( "getLeastCommonMultiple(235,323) " + getLeastCommonMultiple(235,323));
        System.out.println( "getLeastCommonMultiple(42,78) " + getLeastCommonMultiple(42,78));
    }

    // Greatest Common Divisor
    private static long getGcd(long a, long b) {

        // Following http://www.math.rutgers.edu/~greenfie/gs2004/euclid.html
        if (a < b) { // Swap the values of a and b
            final long tmp = a;
            a = b;
            b = tmp;
        }
        while (0 != b) {
            final long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Least Common Multiple
    private static long getLeastCommonMultiple(long a, long b) {
        final long gcd = getGcd(a, b);
        if (1 == gcd) {
            return a * b;
        } else {
            return (a / gcd) * b;
        }
    }
}
