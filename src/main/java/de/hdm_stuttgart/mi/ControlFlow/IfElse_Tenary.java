package de.hdm_stuttgart.mi.ControlFlow;

public class IfElse_Tenary {

    public static void main(String[] args) {


        int a = 5;
        int b = 7;
        int c = 10;
        int result;

        // ELSE IF
        if (a > b)
            System.out.println("a > b");
        else if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a == b");

        // TENARY OPERATOR
        // ? " condition ? if true : if false " Ternary operator
        result = ((a > b) ? a : b);
        System.out.println("Max of three numbers = " + result);
        // Verschachtelt
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

    }
}
