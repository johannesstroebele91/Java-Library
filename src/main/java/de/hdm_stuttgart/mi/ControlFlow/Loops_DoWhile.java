package de.hdm_stuttgart.mi.ControlFlow;

public class Loops_DoWhile {

    public static void main(String[] args) {

        // 1) While
        // Achtung! wird nur durchgeführt, wenn Bedingung erfüllt
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // 2) Do While
        // Achtung! wird das 1. mal auf jedenfall durchgeführt, obwohl hier nicht durchlaufen sollte
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < -5);
    }
}
