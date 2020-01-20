package de.hdm_stuttgart.mi.DataTypes;

public class Print {

    private String name;

    // Constructor
    Print(String name) {
        this.name = name;
    }

    // Print functions
    static private void print() {             // (void)
        System.out.println("No argument");
    }
    static private void print(int i) {        // (int)
        System.out.println("int value " + i);
    }
    static private void print(double d) {     // (double)
        System.out.println("double value " + d);
    }
    static private void print(int i, int j) {System.out.println("Two int values "+ i + " and " + j);
    }

    public static void main(String[] args) {
        print();
        print(33);
        print(4.333);
        print(-1, 7);
    }
}