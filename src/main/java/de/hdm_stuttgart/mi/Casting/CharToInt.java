package de.hdm_stuttgart.mi.Casting;

public class CharToInt {

    public static void main(String[] args) {

        char number4 = '4';
        char number8 = '8';

        // Problem: numbers are converted to their ASCII code representation
        System.out.println( (int)number4 ); // Output: 52
        System.out.println( Integer.valueOf(number8) ); // Output: 56

        // Solution: Character.getNumericValue( char )
        System.out.println( "Character.getNumericValue(number4): " + Character.getNumericValue(number4));
        System.out.println( "Character.getNumericValue(number8): " + Character.getNumericValue(number8));


    }
}
