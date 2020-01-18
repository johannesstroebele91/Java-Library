package de.hdm_stuttgart.mi.Casting;

public class StringToInt {

    public static void main(String[] args) {

        // https://mkyong.com/java/java-convert-string-to-int/

        // 1) option "Integer.parseInt()", "Double.praseInt()", "Long.parseInt()"
        System.out.println("1) Integer.parseInt() -> casting String into number");
        String b = "197";
        String c = "47A"; // NOT POSSIBLE
        int a = 0;
        System.out.println("Int before casting: " + a);
        a = Integer.parseInt(b);
        System.out.println("Int after casting: " + a + "\n");

        /* System.out.println("Int before casting: " + a);
        a = Integer.parseInt(c);
        System.out.println("Int after casting: " + a + "\n"); */


        // 2) option "Integer.valueOf()", "Double.valueOf()", "Long.valueOf()"
        System.out.println("1) Integer.valueOf() -> casting String into number");
        a = 0;
        System.out.println("Int before casting: " + a);
        a = Integer.valueOf(b);
        System.out.println("Int after casting: " + a + "\n");

        /* System.out.println("Int before casting: " + a);
        a = Integer.valueOf(c);
        System.out.println("Int after casting: " + a + "\n"); */
    }
}
