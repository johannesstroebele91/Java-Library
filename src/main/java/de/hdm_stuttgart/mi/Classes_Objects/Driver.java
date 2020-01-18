package de.hdm_stuttgart.mi.Classes_Objects;

public class Driver {


    public static void main(String[] args) {

        /** STRUCTURE
         * Objects, Class variables and methods
         * Static variables and methods
         * Method overloading
         */

        // Objekte nur in dem Scope gültig -> danach rectangle 1 und 2 wieder gelöscht
        System.out.println("There are " + Bicycle.getNumberOfBicycles() + " bicycles");
        Bicycle bicycleRed = new Bicycle(5, 10, 3, 1);
        System.out.println("There are " + Bicycle.getNumberOfBicycles() + " bicycles");
        Bicycle bicycleGreen = new Bicycle(6, 3, 3, 1);

        // Using class variables
        // 1) Public: Using a class variable
        // System.out.println( bicycleGreen.speed ); // compile error, due to "speed" being "private"
        // 2) Private: Using a class method
        System.out.println(bicycleGreen.getSpeed());

        // STATIC methods and variables
        // 1) Public: Using a static variable
        // System.out.println("There are " + numberOfBicycles.num() + " bicycles"); // compile error, due to "numberOfBicycles" being "private"
        // 2) Private: Calling a static method
        System.out.println("There are " + Bicycle.getNumberOfBicycles() + " bicycles");

        // Call overloaded methods
        System.out.println( bicycleRed.rideBicycle() );
        System.out.println( bicycleRed.rideBicycle(3) ); // 3.23 not possible, because int and no double
        System.out.println( bicycleRed.rideBicycle(3.23, 5) );
    }
}
