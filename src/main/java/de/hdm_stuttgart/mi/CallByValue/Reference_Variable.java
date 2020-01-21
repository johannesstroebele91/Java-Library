package de.hdm_stuttgart.mi.CallByValue;

public class Reference_Variable {

    public static void main(String[] args) {

        StringBuffer r = new StringBuffer("Joe");   // 1) Create StringBuffer instance on heap "Joe"
                                                    // 2) Assign heap reference to stack variable "r"

        StringBuffer s = r;                         // 3) Create a second variable
                                                    // holing a copy of variable "r"'s heap reference
                                                    // -> r and s point to the common StringBuffer instance

        r.append(" Simpson");                        // 4) append() adds " Simpson" to existing StringBuffer instance

        // RESULT!!!
        // Both references on the stack point to same appended instance on the heap!
        System.out.println("r = " + r); // Output: r = Joe Simpson
        System.out.println("s = " + s); // Output: s = Joe Simpson
    }
}
