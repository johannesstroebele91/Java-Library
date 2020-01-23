package de.hdm_stuttgart.mi.Testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 * see file resources/log4j2.xml for configuration options
 * and A1.log containing debugging output.
 */

public class SpecialCase_Double {
    private static Logger log = LogManager.getLogger(SpecialCase_Double.class);

    /**
     * The application's main entry point
     *
     * @param args supplies command-line arguments as an array of String objects
     */
    public static void main( String[] args ) {

        // Relevance for testing: comparing difference of doubles values
        System.out.println("The difference of a = 3.6 AND b = 3*1.2 is : " + testDoubleValues() ); // Problem, nicht 0, sondern "4.440892098500626E-16"

        // Actual testing these double values
        double a = 3.6, b = 3*1.2;

        if (a == b){
            System.out.println("A and b are equal"); // false, aber warum? siehe unten
        } else {
            System.out.println("A and b are not equal"); // true, wegen reelen Zahlen:
            // 3.6 zwar eingegeben, aber nur 3.59999990 abspeicherbar
            // -> Somit 2 Werte nie gleich bei float und double
            // Somit darf ich solche Werte nicht mit "==" auf Gleicheit prüfen
            // -> Workaround siehe unten
        }

        // Bessere Lösung
        System.out.println("\nBessere Lösung");
        // 1E-15 ist der letzte Wert, mit dem equals rauskommt
        // vergleichbar mit Differenz -> Math.abs(a-b)<1E-15
        // Erklärung von 1E-15 und Math.abs unten
        if (Math.abs(a-b)<1E-15){
            System.out.println("Math.abs(a-b)<1E-15 leads to the result: equal"); // true
        } else {
            System.out.println("Math.abs(a-b)<1E-15 leads to the result not equal"); // false
        }

        // Excursion: Wie sieht 1E-15 in Kommazahlen aus?
            // Zwar 15, aber 14 nach dem KOMMA!!! -> 1x5 0.0000 + 2x00000 -> 15 nuller
            System.out.println((1E-15 == 0.000000000000001));
    }


    // TEST FÜR DOUBLE-Werte
    public static double testDoubleValues(){
        double a = 1.2;
        double b = 3.6 - 3*a;
        return b;
    }
}