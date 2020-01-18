package de.hdm_stuttgart.mi.Casting;

public class Overflow {

    public static void main(String[] args) {

        // OVERFLOW

        // Watch out for overflows -> casting long into an int
        System.out.println("\nWatch out for overflows:");
        long l = 3000000000000000L;
        int i = 0;
        i = (int) l;
        System.out.println("i carrying long:" + i);

        double d = 44300000000000.0;
        i = (int) d;
        System.out.println("i carrying double:" + i);

        // Solution to avoid overflows
        System.out.println("\nSolution to avoid overflows:");
        l = 220000000;
        i = 0;

        // Bedingung sorgt dafür, dass nur gecasted wird,
        // wenn l nicht den max- & min-wert des Integers überschreitet!
        if (l <= Integer.MAX_VALUE && Integer.MIN_VALUE >= l) {
            i = (int) l;
            System.out.println("i carrying double:" + i);
        }
        // Ansonsten wird nicht gecastet
        else {
            System.out.println("Sorry, long zu groß oder zu klein, um in einen int gecastet zu werden");
        }
    }
}
