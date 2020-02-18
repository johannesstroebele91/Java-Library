package de.hdm_stuttgart.mi.CallByValue;

public class CallByValue_ValueVariable {

    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x); // Output: still 5 -> not changed, because call by value
    }

    private static void change(int x) {
        x = 10;
    }
}
