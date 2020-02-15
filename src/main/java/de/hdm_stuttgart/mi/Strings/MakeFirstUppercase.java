package de.hdm_stuttgart.mi.Strings;

public class MakeFirstUppercase {

    public static void main(String[] args) {

        String name = "lUISA";

        // Make first letter of both words upper case
        // 1) using
        String sFirstLarge1 = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(sFirstLarge1);
        String sFirstLarge2 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(sFirstLarge2);

        // 2) using charAt()
        String sFristLarge3 = name.toUpperCase().charAt(0) + name.substring(1);
        System.out.println(sFristLarge3);

    }
}
