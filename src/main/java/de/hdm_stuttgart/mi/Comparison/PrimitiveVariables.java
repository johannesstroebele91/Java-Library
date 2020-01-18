package de.hdm_stuttgart.mi.Comparison;

public class PrimitiveVariables {

    public static void main(String[] args) {

        // 1) Comparing primitive data types, but NOT double variables
        System.out.println("1) Comparing primitive data types, but double variables");
        char a = 5, b = 5;
        // Output: true
        System.out.println("* == comparison of primitive data types equals:  " + (a==b) + "\n");

        // TODO: fix -> look for problem when looking through se1 script
        // 2) Comparing double variables
        System.out.println("2) Comparing double variables");
        // compares the two specified double values
        double d1 = 0.00000000000000001;
        double d2 = 0.000000000000000009;

        if(d1 > d2) {
            System.out.println("d1 is greater than d2");
        } else if(d1 < d2) {
            System.out.println("d1 is less than d2");
        } else {
            System.out.println("d1 is equal to d2");
        }


        int retval = Double.compare(d1, d2);

        if(retval > 0) {
            System.out.println("d1 is greater than d2");
        } else if(retval < 0) {
            System.out.println("d1 is less than d2");
        } else {
            System.out.println("d1 is equal to d2");
        }
    }
}
