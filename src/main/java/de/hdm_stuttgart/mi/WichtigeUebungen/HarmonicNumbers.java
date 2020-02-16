package de.hdm_stuttgart.mi.WichtigeUebungen;

public class HarmonicNumbers {

    public static void main(String[] args) {
        System.out.println( "Harmonic number for 5: " + harmonicNumber(5));
        // System.out.println( "Harmonic number for 10: " + harmonicNumber(10));
        // System.out.println( "Harmonic number for 15: " + harmonicNumber(15));

    }

    static private double harmonicNumber(final int n) {

        double result = 0;

        for (int i = 1; i <= n; i++) {
            result = result + 1 / (double)i;
            System.out.println( + i + ". iteration: " +result);

        }
        return result;
    }
}
