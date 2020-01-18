package de.hdm_stuttgart.mi.Operators;

public class Logical {

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/operators-in-java/

        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // && AND operator
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");


        // || OR operator
        if (a > b || c == d)
            System.out.println("One or both"
                    + " the conditions are true");
        else
            System.out.println("Both the"
                    + " conditions are false");

        // ! NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

        // ? " condition ? if true : if false " Ternary operator
        int result;
        result = ((a > b) ? a : b);
        System.out.println("Max of three numbers = " + result);
        // Verschachtelt
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

    }
}
