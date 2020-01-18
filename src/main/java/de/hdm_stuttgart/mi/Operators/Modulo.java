package de.hdm_stuttgart.mi.Operators;

public class Modulo {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Bestimmen wodurch eine Zahl teilbar ist -> REST IST DAS ERGEBNIS
        int remainder = a % b;
        System.out.println("10 % 3 = " + remainder); // 10/3 = 3 -> Rest = 1
        // -> wenn 0, dann ohne Rest teilbar

        remainder = b % a;
        System.out.println("3 % 10 = " + remainder); // 3/10 geht nicht -> Rest 3

        // Module kann nicht rückgängig gemacht werden! (geht bei addition) -> gut für Kryptographie


        // Implementing my own Module Function
        System.out.println( modulo(5,3) ); // output: 2
        System.out.println( modulo(19,7) ); // output: 5
    }

    public static int modulo(int a, int b) {

        // 1. Anzahl wie oft b in a geht -> 12/7, wobei dieses runden
        // 2. a - Anzahl wie oft es reingeht * b
        return a - Math.round(a/b)*b;
    }
}