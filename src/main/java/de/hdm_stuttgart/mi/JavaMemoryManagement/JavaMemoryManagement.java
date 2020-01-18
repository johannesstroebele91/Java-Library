package de.hdm_stuttgart.mi.JavaMemoryManagement;

import java.util.Scanner;

public class JavaMemoryManagement {

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/java-memory-management/

        /* Relevance
         * Java itself manages the memory and needs no explicit intervention of the programmer
         * Garbage collector itself ensures that
         * the unused space gets cleaned and memory can be freed when not needed
         */

        /* Stack
         * contains local variables, methods, function calls, and reference variables
         * used to store data and partial results
         * which will be needed while returning value
         * for method and performing dynamic linking
         * Variables stored in stacks are only visible to the owner
         *
         * WARNING: If there is no memory left in the stack for storing function call or local variable,
         * JVM will throw java.lang.StackOverFlowError
         *
         */// Examples:
        int number = 5;
        char letter = 'A';

        /* Heap
         * stores objects in a memory
         * It is instantiated during the virtual machine startup (running java program)
         * When a new keyword is used, object is assigned a space in heap (allocated to the heap),
         * afterwards its reference gets pushed to the stack
         * Variables stored in heap are  visible to all the threads
         *
         * WARNING: If there is no more heap space for creating an object,
         * JVM will throw java.lang.OutOfMemoryError
         *
         */// Examples:
        int[] numbers = {1,2,3}; // Array-Objects are storied on the Heap, but its reference on the Stack
        Scanner sc = new Scanner(System.in); // Imported Class Objects are stored on the Heap, but its reference on the Stack
        Rectangle rectangleSmall = new Rectangle(2,3); // Self-Created objects are stored on the Heap, but its reference on the Stack

        // Special Case String:
        String word = "hello";
        /* Such String-Objects are stored in the String Pool on the heap
         * and its reference on the Stack
         * Result: they CAN be compared with "=="
         */
        String longWord = new String ("hello World"); // new String is redundant
        /* Using NEW keyword stores the String-Objects NOT in the the String Pool, but the normal Heap
         * and its reference on the Stack
         * Result: they CANNOT be compared with "==", BUT with .hashcode and .equals
         */

    }
}
