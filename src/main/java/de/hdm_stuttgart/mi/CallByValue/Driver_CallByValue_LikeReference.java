package de.hdm_stuttgart.mi.CallByValue;

public class Driver_CallByValue_LikeReference {

    // ES GIBT KEINEN CALL BY REFERENCE!!!
    // -> Workaround siehe unten
    public static void main(String[] args) {

        Rectangle a = new Rectangle(3,5); // Stack: Reference a; Heap; Content 3 und 5
        System.out.println("Before - height: " +a.height + " width: " + a.width);

        append(a);

        System.out.println("After - height: " +a.height + " width: " + a.width); // a ist gleich

    }

    static public void append(Rectangle b){ // Stack: Reference b; Heap; Content 3 und 5

        // Hier kopiere ich das Objekt, damit ich die Funktion wie Call by Reference nutzen kann
        // Trotzdem wurde eigentlich der Value übergeben, dieser wird nur nicht angefasst :)
        b = new Rectangle(7,10); // "new" -> erstellt ein neues Objekt -> Reference b; Heap; Content 7 und 10
        // ABER DAS JUCKT DOCH MEIN A NICHT DIGGI -> deshalb a danach immer noch gleich
    }
}
