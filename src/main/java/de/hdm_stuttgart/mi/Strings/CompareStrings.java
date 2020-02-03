package de.hdm_stuttgart.mi.Strings;

public class CompareStrings {

    // Is (at least) one of the Strings
    // in the other one
    // without considering larg and small letters?

    // Cases:
    // Left String is in the right string
    static public final int LEFT_IN_RIGHT_CONTAINED= 1;
    // Right String is in the left string
    static public final int RIGHT_IN_LEFT_CONTAINED = 2;
    // Strings are equal
    static public final int EQUAL = 3;
    // Strings are not contained within each other
     static public final int NOT_CONTAINED = 4;

    public static void main(String[] args) {
        compareStrings("cat", "cat");
        compareStrings("cat", "ca");
    }
    public static int compareStrings(final String left, final String right) {


        if (left == null || right == null) {
            throw new NullPointerException();
        } else {

            // Convert Strings both to lower or large letters for comparison
            final String leftSmall = left.toLowerCase();
            final String rightSmall = right.toLowerCase();

            // Comparison with equals and contains
            if (leftSmall.equals(rightSmall)) {
                return EQUAL;
            } else if(rightSmall.contains(leftSmall)) {
                return LEFT_IN_RIGHT_CONTAINED;
            } else if (leftSmall.contains(rightSmall)) {
                return RIGHT_IN_LEFT_CONTAINED;
            } else {
                return NOT_CONTAINED;
            }
        }
    }

}
