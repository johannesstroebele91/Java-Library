package de.hdm_stuttgart.mi;

import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {

        // Creating an Object of the Scanner class
        Scanner myObj = new Scanner(System.in); // can be used multiple times

        // Declaring a String input with the value of the next line
        System.out.println("Enter dish:"); // UNNECESSARY: just advice for the input
        String inputString = myObj.nextLine(); // IMPORTANT!
        // inputString = myObj.next(); // next() only saves the next word (until whitespace)
        System.out.println("Dish is: " + inputString + "\n"); // UNNECESSARY: just printing the input

        // Declaring a int input with the value of the next int value
        System.out.println("Enter your favorite number:"); // UNNECESSARY: just advice for the input
        int inputInt = myObj.nextInt();  // IMPORTANT!
        System.out.println("My favorite number: " + inputInt  + "\n"); // UNNECESSARY: just printing the input

        // Others input possibilities
        // double inputDouble = myObj.nextDouble();
        // boolean inputChar = myObj.nextBoolean();
    }
}
