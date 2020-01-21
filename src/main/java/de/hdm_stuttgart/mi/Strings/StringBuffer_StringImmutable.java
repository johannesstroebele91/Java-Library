package de.hdm_stuttgart.mi.Strings;

public class StringBuffer_StringImmutable {

    public static void main(String[] args) {

        // Unterscheidung
        // a) Strings können nicht verändert werden -> sie werden neu erstellt
        // b) Aber StringBuffer ermöglicht eine Veränderung


        // a) Normale Strings
        // 1. String wird auf dem Heap zuerst ohne Pointer erstellt und wird Reference zugewiesen
        String a ="hello";
        System.out.println(a);

        // 2. String wird auf dem Heap zuerst ohne Pointer erstellt und wird Reference zugewiesen
        String b = " welt";
        System.out.println(b);

        // 3. String ist dann der neue Zusammengefügt
        a += b;
        System.out.println(a);

        // b) StringBuffer ermöglicht eine Veränderung, ist aber wie in String
        // Somit nur 1 String
        StringBuffer s = new StringBuffer("Hello");
        StringBuffer r = new StringBuffer("What are you doing?");
        StringBuffer t = new StringBuffer("Goodbye");

        System.out.println(s);

        // Append()
        // Super useful function
        // Append allows to add a string to another string
        s.append(", world ...");
        r.append(" I'm doing great.");
        t.append(" Sarah");

        System.out.println(s);

        s.substring(0,5);
        System.out.println(s);
    }
}
