package de.hdm_stuttgart.mi.CallByValue;

public class Value_Variable {

    public static void main(String[] args) {

        // Value variable details
        int a = 1;  // 1) create int variable a on stack
        int b = a;  // 2) create int variable b on stack
        // 3) and initialize with a's value
        a = 5;      // 4) Assign new value 5 to a (b does not change)

        // RESULT!!! "a" and "b" are different!
        System.out.println("a = " + a); // Output: a = 5
        System.out.println("b = " + b); // Output: b = 1
    }
}
