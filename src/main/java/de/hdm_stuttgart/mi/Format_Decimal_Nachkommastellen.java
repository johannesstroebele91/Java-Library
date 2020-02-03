package de.hdm_stuttgart.mi;

public class Format_Decimal_Nachkommastellen {

    public static void main(String[] args) {

        // https://stackoverflow.com/questions/433958/java-decimal-string-format

        // Wenn ich WENIGER Nachkommastellen möchte -> 2 hier
        double d = 10.0 / 3.0;
        String result = String.format("%.2f", d);
        System.out.println(result);

        // Wenn ich MEHR Nachkommastellen möchte -> 3 hier
        result = String.format("%.3f", 2.5);
        System.out.println(result);

    }
}
