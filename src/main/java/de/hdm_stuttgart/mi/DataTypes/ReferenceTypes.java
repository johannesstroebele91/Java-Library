package de.hdm_stuttgart.mi.DataTypes;

public class ReferenceTypes {

    public static void main(String[] args) {

        // REFERNCE TYPES (based on classes)

        // 1) BUILD IN CLASSES

        // String
        // Are included via the java.lang.String class
        String s1 = "peter"; // IIs created in String pool
        String s2 = new String("peter"); // s created on the heap

        // Array
        int[] oneDimArray1 = {1,2,3};
        int[] oneDimArray2 = new int[] {1,2,3};
        int[] oneDimArray3 = new int[4];

        // 2-Dim Array
        int[][] twoDimArray1 = { {1, 2, 3, 4}, {5, 6, 7} };
        int[][] twoDimArray2 = new int[][]{ {1, 2, 3, 4}, {5, 6, 7} };
        int[][] twoDimArray3 = new int[1][2];

        // Enum
        // Accessing via
        Level myVar = Level.MEDIUM;

        // 2) USER DEFINED CLASSES
        ReferenceTypes rectangle = new ReferenceTypes(4,5);
        System.out.println(rectangle.height + rectangle.width);
    }

    public int width;
    public int height;

    public ReferenceTypes(int width, int height) {
        this.width = width;
        this.height = height;
    }

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
}
