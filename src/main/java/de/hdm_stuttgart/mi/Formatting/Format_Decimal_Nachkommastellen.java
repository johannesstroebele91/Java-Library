package de.hdm_stuttgart.mi.Formatting;

public class Format_Decimal_Nachkommastellen {

    public static void main(String[] args) {

        // https://stackoverflow.com/questions/433958/java-decimal-string-format

        // 2 Nachkommastellen -> 2f
        double d = 10.0 / 3.0;
        String result = String.format("%.2f", d);
        System.out.println(result); // Output: 3.33

        // 3 Nachkommastellen -> 3f
        result = String.format("%.3f", 2.5);
        System.out.println(result); // Output: 2.500

        // Cents to Euro
        int preis = 48291; // Cents
        System.out.println(String.format("%.2f", (double)preis/100));
    }
}
