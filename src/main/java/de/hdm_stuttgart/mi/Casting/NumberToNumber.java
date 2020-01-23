package de.hdm_stuttgart.mi.Casting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberToNumber {

    public static void main(String[] args) {

        /* Structure
         * Normal castings
         * Special cases
         * ARRAYS
         */

        // NORMAL CASTINGS
        // Long into int
        System.out.println("1) Option: i = (int) l -> casting long into int:");
        long l = 4345;
        int i = (int) l;
        System.out.println("i carrying long: " + i);

        // Double into an int
        double d = 44.2323;
        i = (int) d;
        System.out.println("i carrying double: " + i);

        // Integer to int
        Integer intobject = (68); // old writing: Integer intobject = new Integer(68);
        i = intobject;
        System.out.println("i carrying Integer:" + i);

        // Int to Integer
        int iInt = 10;
        Integer iInteger = (iInt);
        System.out.println("i carrying int:" + i);

        // SPECIAL CASES
        // Attention for Division of 2 int values !!! 8 / 9 -> result is also an int!
        System.out.println( "8/9 = " + 8 / 9); // WRONG: Output 0 -> not a decimal number AND 0.888 should be rounded to 1, not to 0!
        System.out.println( "8/9.0 = " + 8 / 9.0); // CORRECT: 0.8888 -> because 9.0 is a double -> therefore double result

        // 4.0 is NOT float, but double!
        // float a = 4.0; // compile error -> 4.0 is NOT float, but double!
        double a = 4.0;

        // Casting double to float: 4.0 is a double!
        a = 4.0;
        // float b = (1+2+3+4)/a; // -> compile error -> a is a double, but b is a float!
        float b = (1+2+3+4)/4.0F;       // 1) Solution: "F" to make it a float
        b = (float) ( (1+2+3+4)/4.0);   // 2) Solution: cast double to float

        // Casting double to float: Math.sqrt(4)
        // float c = Math.sqrt(4); // compile error -> Math.sqrt is a float, but double needed
        float f = (float) Math.sqrt(4); // Solution: cast double to float

        // Casting long to double: Math.round()
        // Result of "Math.round()" is a long ->
        double e = (double) Math.round(7.23821722);
        System.out.println("e" + e); // 7.0 -> needs double!

        // ARRAYS
        // Integer [] to Int[]
        Integer[] integerArray = {1,2,3};
        int[] intArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        System.out.println("i carrying int:" + i);

        // Int[] to Integer []
        integerArray = IntStream.of( intArray ).boxed().toArray( Integer[]::new );
        System.out.println("i carrying Integer:" + integerArray.toString());
    }
}
