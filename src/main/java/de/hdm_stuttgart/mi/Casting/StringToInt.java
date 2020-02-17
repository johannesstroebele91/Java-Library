package de.hdm_stuttgart.mi.Casting;

public class StringToInt {

    public static void main(String[] args) {

        // https://mkyong.com/java/java-convert-string-to-int/

        // 1) "Integer.parseInt()", "Double.praseInt()", "Long.parseInt()"
        String b = "197";
        String c = "47A"; // NOT POSSIBLE
        int a = 0;
        System.out.println("Int a before casting: " + a);
        a = Integer.parseInt(b);
        System.out.println("Casting String into int with Integer.parseInt(): " + a + "\n");

        /* System.out.println("Int before casting: " + a);
        a = Integer.parseInt(c);
        System.out.println("Int after casting: " + a + "\n"); */


        // 2) "Integer.valueOf()", "Double.valueOf()", "Long.valueOf()"
        System.out.println("1)  -> casting String into number");
        a = 0;
        System.out.println("Int before casting: " + a);
        a = Integer.valueOf(b);
        System.out.println("Casting String into int with Integer.valueOf(): " + a + "\n");

        /* System.out.println("Int before casting: " + a);
        a = Integer.valueOf(c);
        System.out.println("Int after casting: " + a + "\n"); */
    }
}
