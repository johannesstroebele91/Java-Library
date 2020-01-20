package de.hdm_stuttgart.mi.Functions;

public class MethodOverloading {

    public static void main(String[] args) {
        print();
        print(33);
        print(4.333);
        print(-1, 7);
    }

    // Overloaded Methods (= Static polymorphism)
    // Polymorphism is the ability of an object to take on many forms
    // (void)
    static public void print() {System.out.println("No argument");
    }
    // (int)
    static public void print(int i) {System.out.println("int value " + i);
    }
    // (double)
    static public void print(double d) {System.out.println("double value " + d);
    }
    // (int, int)
    static public void print(int i, int j) {System.out.println("Two int values "+ i + " and " + j);
    }
}
