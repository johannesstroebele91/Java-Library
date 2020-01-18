package de.hdm_stuttgart.mi.CallByValue;

public class Driver_CallByValue {

    // HIER GEHTS GANZ NORMAL UM CALLBYVALUE:
    public static void main(String[] args) {

        // Only call by value There is no call by reference in Java
        Rectangle a = new Rectangle(3,5); // Stack: Variable a die referenziert auf Heap Content: 3 und 5
        System.out.println("Before - height: " +a.height + " width: " + a.width);

        append(a);
        // Object "a" was passend into
        System.out.println("After - height: " +a.height + " width: " + a.width); // Da der Content über b direkt geändert wurde, ist auch der Content von "a" anders

    }

    static public void append(Rectangle b){ // Variable b die referenziert auf Heap Content: 3 und 5
        b.setHeight(15); // hier wird direkt der Content auf dem Heap geändert auf die auch a referenziert
        b.setWidth(13); // hier wird direkt der Content auf dem Heap geändert auf die auch a referenziert
    }
}
