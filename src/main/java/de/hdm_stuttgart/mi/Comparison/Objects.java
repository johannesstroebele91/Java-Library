package de.hdm_stuttgart.mi.Comparison;

public class Objects {

    public static void main(String[] args) {

        /** COMPARING OBJECTS CREATED ON THE HEAP
         * LÖSUNG: https://stackoverflow.com/questions/16069106/how-to-compare-two-java-objects
         * 1. Lösungsanzatz: "=="
         * 2. Lösungsanzsatz: HASHCODE
         * 3. Lösungsanzsatz: EQUALS
         */

        System.out.println("4) Comparing objects created on the heap:");
        Rectangle g = new Rectangle(7, 4);
        Rectangle h = new Rectangle(3, 8);

        // 1. Lösungsanzatz: "=="
        // System.out.println((g==h));
        // Ergebnis ist "flase", da nicht Obj, sondern Reference verglichen wird
        // Die Reference ist natürlich unterschiedlich, weshalb Ergebnise "false"

        // https://www.geeksforgeeks.org/difference-equals-method-java/

        // 2. Lösungsanzsatz: HASHCODE
        // hashCode() funktioniert NUR, wenn hashCode() Function in Klasse erzeugt wurde
        // DIES GEHT AUTOMATISCH 1) Code 2) Generate 3) Generate equals and hashcode
        // Liefert zwar "True", aber vergleicht nicht genau das Ergebnis
        System.out.println("Hashcode von g: " + g.hashCode());
        System.out.println("Hashcode von h:  " + h.hashCode());
        System.out.println("* hashcode() comparison of objects, compares the content. Therefore, the result is: " + (g.hashCode() == h.hashCode()));

        // 3. Lösungsanzsatz: EQUALS
        // Wenn hashcode true, dann wird mit equals überprüft ob WIRKLICH gleich
        // AUCH FÜR EQUALS IST MUSS EINE Function in Klasse erzeugt werden
        // DIES GEHT AUCH AUTOMATISCH 1) Code 2) Generate 3) Generate equals and hashcode
        System.out.println("* equals() comparison of objects, compares the content. Therefore, the result is: " + g.equals(h));
    }
}
