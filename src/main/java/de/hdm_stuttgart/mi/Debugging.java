package de.hdm_stuttgart.mi;

public class Debugging {

    int a;

    public Debugging (int a){ this.a = a; }

    /* IM DEBUG MODUS STARTEN

        SHORTKEYS
        * MIT F8 step over -> größere Schritte
        * MIT F7 step into -> kleine Schritte

        FRAMES
        * Enthält alle Variablen

        TIPPS
        * Variablen sieht mehr erst in der nächsten Zeile
        * 3 Stack frames -> den von area, den von square und den von main -> was sidn stack frames
        * kann man sich auch heap anschauen?
        a) Java Visualizer -> https://prog.mi.hdm-stuttgart.de/java_visualize/
        b)
        */

    static double square(double l){
        return l*l;
    }

    static double area (double r){
        final double s = square(r); // 2. Ruf square-Methode auf
        return Math.PI * s; // 3. Return result
    }

    public static void main(String[] args) {

        Debugging rect = new Debugging(2);
        double a = area(2); // 1. Ruf area-Methode auf // HIER BREAKPOINT SETZEN
        System.out.println("Area: " + a); // 4. print result
    }
}
