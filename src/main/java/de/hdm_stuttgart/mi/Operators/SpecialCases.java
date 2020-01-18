package de.hdm_stuttgart.mi.Operators;

public class SpecialCases {

    public static void main(String[] args) {

        // Attention! Hidden casting!!!!
        System.out.println(8 / 9); // WRONG: Output 1 -> 2 int -> result is an int
        System.out.println(8 / 9.0); // CORRECT: 0.8888

        double f = 34.3 / 0;
        System.out.println("Value: " + f);
    }
}
