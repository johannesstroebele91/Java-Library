package de.hdm_stuttgart.mi.Strings;

public class TotalLength_Strings {

    // Total length of all strings in an array
    // e.g.: new int[] {"12", null, "345"} -> 2 + 0 + 3 == 5
    public static void main(String[] args) {
        System.out.println( "getTotalLength(new String[]{\"12\", null, \"345\"}): " + getTotalLength(new String[]{"12", null, "345"}));
    }

    static private int getTotalLength(final String[] strings) {
        if (null == strings) {
            return 0;
        } else {
            int summe = 0;
            for (final String s: strings) {
                if (null != s) {
                    summe += s.length();
                }
            }
            return summe;
        }
    }
}
