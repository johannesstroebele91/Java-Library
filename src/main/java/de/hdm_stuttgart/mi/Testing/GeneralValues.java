package de.hdm_stuttgart.mi.Testing;

public class GeneralValues {

    // 1) Möchte testen ob richtigen boolean Werte rauskommen
    public static boolean biggerTen(int a){
        return (a>10);
    }

    // 2) Möchte testen ob richtige Werte rauskommen
    public static int calculate(int a, int b){
        return a+b;
    }

    // 3) Test for correct sum of two arguments.
    public static int add(final int a, final int b) {
        return a + b;
    }

    // Test if prime number (relevance of negative tests)
    public static boolean isPrime(int a){
        return true;
    }
}
