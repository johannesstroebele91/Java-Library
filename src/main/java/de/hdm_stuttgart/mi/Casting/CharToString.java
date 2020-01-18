package de.hdm_stuttgart.mi.Casting;

public class CharToString {

    public static void main(String[] args) {

        String input = "hello world";

        // String to Char[]
        char[] copy = input.toCharArray();

        // Char[] to String
        String newCopy1 = new String(copy);
        System.out.println(newCopy1);
        // String newCopy2 = copy.toString(); // FUNKT NICHT!!!! FALSCH
        // System.out.println(newCopy2);
        String newCopy3 = String.valueOf(copy);
        System.out.println(newCopy3);
    }
}
