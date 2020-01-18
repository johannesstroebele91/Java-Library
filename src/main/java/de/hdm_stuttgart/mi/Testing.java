package de.hdm_stuttgart.mi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLOutput;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 * see file resources/log4j2.xml for configuration options
 * and A1.log containing debugging output.
 */

public class Testing {
    private static Logger log = LogManager.getLogger(Testing.class);

    /**
     * Your application's main entry point.
     *
     * @param args Yet unused
     */
    public static void main( String[] args ) {
        System.out.println(test()); // Problem, nicht 0, sondern "4.440892098500626E-16"
        // SEPARATE METHODE FÜR DOUBLE VERGLEICH NÖTIG

        // Further testing double values
        double a = 3.6, b = 3*1.2;

        if (a == b){
            System.out.println("equal"); // false, aber warum? siehe unten
        } else {
            System.out.println("not equal"); // true, wegen reelen Zahlen:
            // 3.6 zwar eingegeben, aber nur 3.59999990 abspeicherbar
            // -> Somit 2 Werte nie gleich bei float und double
            // Somit darf ich solche Werte nicht mit "==" auf Gleicheit prüfen
            // -> Workaround siehe unten
        }

        System.out.println("Bessere Lösung");
        // 1E-15 ist der letzte Wert, mit dem equals rauskommt
        // vergleichbar mit Differenz -> Math.abs(a-b)<1E-15
        // Erklärung von 1E-15 und Math.abs unten
        if (Math.abs(a-b)<1E-15){
            System.out.println("equal"); // true
        } else {
            System.out.println("not equal"); // false
        }

        // Wie sieht 1E-15 in Kommazahlen aus?
        // Zwar 15, aber 14 nach dem KOMMA!!! -> 1x5 0.0000 + 2x00000 -> 15 nuller
        System.out.println((1E-15 == 0.000000000000001));

        // Was bedeutet Math.abs(a-b)?
        // Bei b-a würde negative Differenz rauskommen
        // Damit wäre ein Verleich nicht möglich
        // da sowohl negativer und postiver Case abgedeckt werden müsste
        // Deshalb Betrag bilden mit Math.abs(b-a)
        System.out.println("b-a = " + Math.abs(b - a));
    }

    // Möchte testen ob richtigen boolean Werte rauskommen
    public static boolean biggerTen(int a){            return (a>10); }

    // Möchte testen ob richtige Werte rauskommen
    public static int calculate(int a, int b){          return a+b; }
    public static int add(final int a, final int b) {   return a + b; }

    // Relevanz von Negativtests
    public static boolean isPrime(int a){              return true; }

    // TEST FÜR DOUBLE-Werte
    public static double test(){
        double a = 1.2;
        double b = 3.6 - 3*a;
        return b;
    }
}