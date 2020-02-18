package de.hdm_stuttgart.mi.Array;

public class FindCharInString {

    public static void main(String[] args) {
        // Leerzeichen finden
        String input = "Ein schöner warmer Sommer steht an";
        if (input == null)
            System.out.println("return null");
        else {
            final char[] copy = input.toCharArray();

            for(int i = 0; i<copy.length; i++){
                if(copy[i] ==' ')
                    copy[i+1] = Character.toLowerCase(copy[i+1]);
            }
            System.out.println("new String(copy)"); // alt. copy.toString()
        }
    }
}