package de.hdm_stuttgart.mi.Comparison;

import java.util.Objects;

public class Rectangle {

    /** Structure
     * Instance variables
     * Constructor
     * Hashcode methode
     * Equals methode
     * Getter & Setter
     */

    // Instance Variables
    int width;
    int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // HASHCODE METHODE
    // Wird am Anfang wenn das Objekt erstellt wird, für jedes Objekt erstellt und wenn Wert geändert wird
    // jedes Objekt hat zu jeder Zeit einen HashCode
    // Macht man für performance -> erstmal hash vergleichen
    @Override
    public int hashCode() {
        return Objects.hash(width, height); // im Falle von String, könnte ich dieses dazuzählen, wenn ich dieses in binär umwandeln würde
    }

    // EQUALS METHODE
    // Automatischer Erstellung via intellij
    // 1) Code 2) Generate 3) equals and hashcode
    @Override
    public boolean equals(Object o) {

        // g.equals(h) -> g ist das someInt und someString
        // h wird für Object o hier reingeparst -> o = h

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }
}
