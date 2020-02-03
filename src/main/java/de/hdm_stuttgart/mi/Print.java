package de.hdm_stuttgart.mi;

public class Print {

    public static void main(String[] args) {

        int i = 2;
        double j = 2.53;
        System.out.print( "print() -> Inserts NO!!! new line after printing ");
        System.out.println( "println() -> Inserts a new line after printing");

        System.out.println("int value " + i);
        System.out.println("Two int values "+ i + " and " + j);

        // Calculation or not?
        System.out.println(-1);
        System.out.println(-1 + 7); // adds the values together
        // System.out.println("hello", j); // Compile error

        // Escape special characters
        System.out.println( "\n"); // New line / line break
        System.out.println( "\t"); // Tab
        System.out.println( " \"Hello\" "); // quotation marks
        System.out.println( "\'" );  // Single quote
        System.out.println( "\r" ); // return
        System.out.println( "\\\\");
    }
}