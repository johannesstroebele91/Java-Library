package de.hdm_stuttgart.mi.Strings;

public class Substring {

    public static void main(String[] args) {

        // 1) Output starting from the paramter
        String s= new String("brown fox jumps over dog");
        System.out.println("Substring starting from index 15:");
        System.out.println(s.substring(15));

        // 2) Output starting from the 1. paramter and ending at the last parameter
        // WICHTIG!!! der 2. index wird ist exkulsive -> e.g. (2,5) geht von Index 2 bis Index 4
        System.out.println("Substring starting from index 15 and ending at 20:");
        System.out.println(s.substring(15, 20));

        // Make first letter of both words upper case
        // 1) using substring()
        String sFirstLarge1 = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(sFirstLarge1);
        String sFirstLarge2 = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(sFirstLarge2);

        // 2) using charAt()
        String sFristLarge3 = s.toUpperCase().charAt(0) + s.substring(1);
        System.out.println(sFristLarge3);
    }
}