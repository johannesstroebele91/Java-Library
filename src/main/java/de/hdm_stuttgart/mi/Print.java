package de.hdm_stuttgart.mi;

public class Print {
    static public void print() {             // (void)
        System.out.println("No argument");
    }
    static public void print(int i) {        // (int)
        System.out.println("int value " + i);
    }
    static public void print(double d) {     // (double)
        System.out.println("double value " + d);
    }
    static public void print(int i, int j) { // (int, int)
        System.out.println("Two int values "+
                i + " and " + j);
    }

    public static void main(String[] args) {
        print();
        print(33);
        print(4.333);
        print(-1, 7);
    }
}