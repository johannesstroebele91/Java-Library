package de.hdm_stuttgart.mi.Casting;

public class IntToString {

    public static void main(String[] args) {

        // https://www.java67.com/2012/10/best-way-to-convert-numbers-to-string-in-java-example.html

        // 1) Best option "String.valueOf(number);": casting int into String
        System.out.println("1) Best option: String.valueOf(number) -> casting int into String");
        int a = 5;
        String b = "hello";
        System.out.println("String before casting: " +b);
        b = String.valueOf(a);
        System.out.println("Casting int into String: " +b + "\n");

        // Casting int into String
        long l = 3000000000000000L;
        b = "hello";
        System.out.println("String before casting: " +b);
        b = String.valueOf(l);
        System.out.println("Casting long into String: " +b + "\n");

        // 2) option "Integer.toString(int)": casting int into String
        System.out.println("2) option: Integer.toString(int) -> casting in into String");
        b = "hello";
        System.out.println("String before casting: " +b);
        b = Integer.toString(a);
        System.out.println("Casting int into String: " +b + "\n");


    }
}
