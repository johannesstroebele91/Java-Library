package de.hdm_stuttgart.mi.Operators;

public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // https://www.programiz.com/article/increment-decrement-operator-difference-prefix-postfix

        /* Tip:
         * can be applied to variables only
         * uncomment below line to see error
         * b = 10++; -> Can be applied to variables only
         */

        // Pre-Increment
        a = 5;
        System.out.println("++a " + (++a)); // Output: 6 -> Value is incremented first then result is computed
        System.out.println(a + "\n");       // Output: 6

        // Pre-decrement
        a = 5;
        System.out.println("--a " + (--a)); // Output: 4 -> Value is decremented first and then result is computed
        System.out.println(a + "\n");       // Output: 4 ->



        // Post-Increment
        a = 5;
        System.out.println("a++ " + (a++)); // Output: 5 -> Value is first used for computing the result
        System.out.println(a + "\n");       // Output: 6 -> and then incremented

        // Post-decrement
        a = 5;
        System.out.println("a-- " + (a--)); // Output: 5 -> Value is first used for computing the result
        System.out.println(a + "\n");       // Output: 4 -> and then decremented

    }
}
