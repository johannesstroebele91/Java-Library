package de.hdm_stuttgart.mi.Casting;

public class CharToString {

    public static void main(String[] args) {

        String input = "hello world";

        // 1) EASY PROBLEMS

        // String to Char at a certain position
        char charNew = (char) input.charAt(0);

        // Char to String
        String stringNew = String.valueOf(charNew);


        // 2) COMPLEX PROBLEMS

        // String to Char[]
        char[] copy = input.toCharArray();
        System.out.println( "input.toCharArray() " + copy);

        // Char[] to String
        String newCopy1 = new String(copy);
        System.out.println( "new String(copy) " + newCopy1);

        // String newCopy2 = copy.toString(); // FUNKT NICHT!!!! FALSCH
        // System.out.println(newCopy2);
        String newCopy3 = String.valueOf(copy);
        System.out.println(newCopy3);


    }
}
