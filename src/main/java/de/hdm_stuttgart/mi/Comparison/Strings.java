package de.hdm_stuttgart.mi.Comparison;

public class Strings {

    public static void main(String[] args) {

        // TODO: VERBERSSERN
        String a = "hello";
        String b = "welt";

        System.out.println(a.compareTo("123 " + b.compareTo(a)));
        System.out.println(a.compareTo("123 " + a.compareTo(b)));


        // 1) Comparing Strings created on the HEAP
        // String e = new String ("Hello"); -> zwingt, dass nicht im Pool, sondern im Heap erstellt wird!!!
        System.out.println("Comparing Strings created on the heap:");
        String e = new String ("Hello");
        String f = new String ("Hello");

        System.out.println("* == comparison of such Strings is, due to different memory locations of e and f, equals: " + (e==f));
        // Output: FALSE!!!
        // "==" is not working with Strings created on the Heap!
        // MUST USE equals() method
        System.out.println("* equals() compares CONTENT! -> " + e.equals(f) + "\n");
        // Output: TRUE!!!

        // https://www.geeksforgeeks.org/difference-equals-method-java/

        // 2) Comparing Strings created in the STRING POOL
        // Program hat Pool wo alle String drin sind
        // erzeugt kein neues, wenn er da schon eines findet
        // String e = new String ("Hello"); -> zwingt, dass nicht im Pool, sondern im Heap erstellt wird!!!
        // Warum beide true??? -> siehe Erklärung unten!
        System.out.println("Comparing Strings created in the String pool:");
        String c = "Hello";
        String d = "Hello";
        // Output: true
        System.out.println("* == comparison ->  " + (c==d)); // Funktioniert, da Strings nicht auf dem Heap erstellt wurden
        // Output: true
        // System.out.println("* equals() method comparison leads also too same result -> " + c.hashCode(d) + "\n"); // hashcode not possible!
        System.out.println("* equals() method comparison leads also too same result -> " + c.equals(d) + "\n");

    }
}
