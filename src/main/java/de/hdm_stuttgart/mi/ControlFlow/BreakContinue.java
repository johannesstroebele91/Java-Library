package de.hdm_stuttgart.mi.ControlFlow;

public class BreakContinue {

    public static void main(String[] args) {

        System.out.println("starting loop:");

        for (int n = 0; n < 5; ++n) {
            System.out.println("in loop: " + n);
            if (n == 2) {
                continue; // causes the control flow to jump to the loop condition
            }
            System.out.println("   survived first guard");
            if (n == 4) {
                break; // exits the loop
            }
            System.out.println("   survived second guard");
            // continue at head of loop
        }
        System.out.println("end of loop or exit via break\n");
    }
}