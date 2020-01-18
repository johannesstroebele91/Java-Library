package de.hdm_stuttgart.mi.DataTypes;

public class Final {

    /**
     * Your application's main entry point.
     *
     * @param args Yet unused
     */
    public static void main( String[] args ) {

        // Normal variables are MUTABLE (changeable)!
        int a = 10;
        a = 50;

        // 1) Final variables are IMMUTABLE (not changeable)!
        final int c = 100;
        // c = 500; // Compile error!

        // 2) final-Methoden vererben nicht
        // Daher können Methoden in veerbten Klassen
        // diese final-Methode nicht überschreiben!

        printHello();
    }
    static final public void printHello() {
        System.out.println("Hello");
    }
}
