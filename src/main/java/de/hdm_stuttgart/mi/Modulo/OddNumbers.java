package de.hdm_stuttgart.mi.Modulo;

public class OddNumbers {

    public static void main(String[] args) {

        // Ask for integer values and tell users
        // whether a given value is even or odd
        // providing the special value 0 shall terminate your application

        System.out.println( "The number 3 is an odd number: " + isNumberOdd(3));
        System.out.println( "The number 8 is an odd number: " + isNumberOdd(8));
        System.out.println( "The number 283 is an odd number: " + isNumberOdd(283));
    }

    static private boolean isNumberOdd(int number){
        return number%2 != 0;
    }
}
