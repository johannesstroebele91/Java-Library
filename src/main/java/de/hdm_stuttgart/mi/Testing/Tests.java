package de.hdm_stuttgart.mi.Testing;

public class Tests {

    public static void main(String[] args) {

        /* Types of tests
         * Unit test: Test individual methods, classes and packages in isolation.
         * Integration Test: Test a group of associated components/classes.
         * Acceptance / Functional Test: Operate on a fully integrated system, testing against the user interface.
         * Regression Test: Ensure system integrity after (implementation) change.
         * Load test: Responsiveness vs. system load.
         */

        /* Tips for testing
         * Always check for null, 0, and negative values!
         * Using comparison methods such as assertEquals or assertFalse
         * the following statements aren't the tests!
         * They REAL tests are in the "test" section!
         */
        System.out.println( "biggerTen(3): " + biggerTen(3) );
        System.out.println( "biggerTen(11): " + biggerTen(11) );
        System.out.println( "add(3, 5): " + add(3, 5) );
        System.out.println( "add(-3, 10): " + add(-3, 10) );
        System.out.println( "isPrime(1): " + isPrime(1) );
        System.out.println( "isPrime(2): " + isPrime(2) );
    }

    // 1) Möchte testen ob richtigen boolean Werte rauskommen
    public static boolean biggerTen(int a){
        return (a>10);
    }

    // 2) Test for correct sum of two arguments.
    public static int add(final int a, final int b) {
        return a + b;
    }

    /** 3) Test if prime number (relevance of negative tests)
     * @param a value A positive value
     * @return true if and only if value is a prime number
     */
    public static boolean isPrime(int a){
        return true;
    }
}
