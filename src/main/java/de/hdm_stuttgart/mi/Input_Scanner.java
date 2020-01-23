package de.hdm_stuttgart.mi;

import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {

        /* Creating Object of the Scanner class
         * "scanner" CAN and SHOULD be used multiple times if needed
         * -> DONT create unnecessary additional scanner objects!
         * scanner needs to be closed at the end! "scanner.close()"
         */

        //
        Scanner scanner = new Scanner(System.in); // can be used multiple times

        // 1) "scanner.nextLine()"
        // Declaring a String input with the value of the next line
        System.out.println("Enter dish:"); // UNNECESSARY: just advice for the input
        String inputString = scanner.nextLine(); // IMPORTANT!
        // inputString = myObj.next(); // next() only saves the next word (until whitespace)
        System.out.println("Dish is: " + inputString + "\n"); // UNNECESSARY: just printing the input

        // 2) "scanner.nextInt()"
        // Declaring a int input with the value of the next int value
        System.out.println("Enter your favorite number:"); // UNNECESSARY: just advice for the input
        int inputInt = scanner.nextInt();  // IMPORTANT!
        System.out.println("My favorite number: " + inputInt  + "\n"); // UNNECESSARY: just printing the input

        // 3) close()
        // Scanner needs to be CLOSED at the end!!!
        scanner.close();

        // 4) Others input possibilities
        // double inputDouble = myObj.nextDouble();
        // boolean inputChar = myObj.nextBoolean();
    }
}
