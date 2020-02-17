package de.hdm_stuttgart.mi.Strings;

public class StringBuffer_StringImmutable {

    public static void main(String[] args) {

        // Difference
        // a) String: cannot be changed  -> are newly created
        // b) StringBuffer: changeable


        // a) Strings: 1) created on the heap without pointer 2) reference is assigned to content on heap
        String a ="hello"; // 1) String
        String b = " welt"; // 2) String
        System.out.println(a);
        System.out.println(b);
        a += b; // 3) String
        System.out.println(a);

        // b) StringBuffer: mutable
        StringBuffer s = new StringBuffer("Hello");
        StringBuffer r = new StringBuffer("What are you doing?");
        StringBuffer t = new StringBuffer("Goodbye");
        System.out.println(s);


        // CONVERT StringBuffer TO String
        String stringNormal = s.toString();
        System.out.println( stringNormal);


        // FUNCTIONS

        // String.append(): add a string to another string
        s.append(", world ...");
        r.append(" I'm doing great.");
        t.append(" Sarah");
        System.out.println(s);

        // String.substring(): cut out string of a string
        s.substring(0,5);
        System.out.println(s);

        // String.substring(): set Char at a specific index
        System.out.println( "StringBuffer.setCharAt(index, char) ");
        s.setCharAt(2, 'a');
    }
}
