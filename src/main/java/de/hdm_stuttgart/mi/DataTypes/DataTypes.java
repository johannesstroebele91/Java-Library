package de.hdm_stuttgart.mi.DataTypes;

public class DataTypes {

    public static void main(String[] args) {

        // Declaration statement
        int a, b;

        // Initilization statement
        int c = 32;

        // Variable name & Literal (e.g. 123, 32.30, "hello", 'A', true)
        a = 123; // Literal: 123, 32.30, "hello", 'A', true

        // PRIMITIVE TYPES

        // byte: 1 byte
        // [−2^7,2^(7)−1]
        // Signed integer
        System.out.println(Byte.TYPE);
        System.out.println(Byte.BYTES + " / " + Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE + "\n");

        // short: 2 short
        // [−2^15,2^(15)−1]
        // Signed integer
        System.out.println(Short.TYPE);
        System.out.println(Short.BYTES + " / " + Short.SIZE);
        System.out.println(Short.MIN_VALUE );
        System.out.println(Short.MAX_VALUE+ "\n");

        // int: 4 byte
        // [−2^31,2^(31)−1]
        // Signed integer
        System.out.println(Integer.TYPE);
        System.out.println(Integer.BYTES + " / " + Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE+ "\n");

        // long: 8 byte
        // [−2^63,2^(63)−1]
        // Signed integer
        System.out.println(Long.TYPE);
        System.out.println(Long.BYTES + " / " + Long.SIZE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE+ "\n");

        // char: 2 byte
        // [0,216−1]
        // Unsigned integer
        System.out.println(Character.TYPE);
        System.out.println(Character.BYTES + " / " + Character.SIZE);
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE + "\n");

        // float: 4 bytes
        // Floating point
        System.out.println(Float.TYPE);
        System.out.println(Float.BYTES + " / " + Float.SIZE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE+ "\n");

        // double: 8 bytes
        // Floating point
        System.out.println(Double.TYPE);
        System.out.println(Double.BYTES + " / " + Double.SIZE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE+ "\n");

        // boolean: ? bytes
        // Logical value
        // true, false

        // REFERNCE TYPES (based on classes)

        // 1) Built in classes:

        // String
        // Are included via the java.lang.String class
        String s1 = "peter"; // IIs created in String pool
        String s2 = new String("peter"); // s created on the heap

        // enum
        // Accessing via
        Level myVar = Level.MEDIUM;

        // Array
        int[] oneDimArray1 = {1,2,3};
        int[] oneDimArray2 = new int[] {1,2,3};
        int[] oneDimArray3 = new int[4];

        // 2-Dim Array
        int[][] twoDimArray1 = { {1, 2, 3, 4}, {5, 6, 7} };
        int[][] twoDimArray2 = new int[][]{ {1, 2, 3, 4}, {5, 6, 7} };
        int[][] twoDimArray3 = new int[1][2];

        // User defined classes
        DataTypes rectangle = new DataTypes();
        System.out.println(rectangle.height);
    }
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public int width;
    public int height;

}
