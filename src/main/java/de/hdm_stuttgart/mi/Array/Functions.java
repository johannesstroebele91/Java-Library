package de.hdm_stuttgart.mi.Array;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        int intArr[] = {10,20,15,22,35};
        final String[] names = {"Eve", "Aaron", "Paul", "Mandy"};

        // Arrays.toString
        System.out.println("Arrays.toString(): " + Arrays.toString(intArr));
        System.out.println("Arrays.toString(): " + Arrays.toString(names) + "\n");

        // Arrays.sort
        Arrays.sort(intArr);
        System.out.println( "Arrays.sort(): " + Arrays.toString(intArr));
        Arrays.sort(names);
        System.out.println( "Arrays.sort(): " + Arrays.toString(names) + "\n");

        // Arrays.fill(names, "N.N") -> überschreibt
        final String[] namesCopy = {"Eve", "Aaron", "Paul", "Mandy"};
        System.out.println( "Arrays.fill() replaces... " + Arrays.toString(namesCopy));
        Arrays.fill(namesCopy, "N.N");
        System.out.println("... with: " + Arrays.toString(namesCopy) + "\n");

        // Arrays.copyOfRange() -> creates a copy of elements from index "2" to index "5"
        System.out.println("Before : " + Arrays.toString(intArr));
        System.out.println( "Arrays.copyOfRange(intArr,2,5) from index 2 to 5: " + Arrays.toString(Arrays.copyOfRange(intArr, 2, 5)) + "\n");

        // Arrays.copyOfRange() -> creates a copy of elements from index "2" to index "5"
        System.out.println(".equals(): " + ( names[0].equals(names[3])  ? "true" : "false"));
        System.out.println(".equals(): " + ( names[0].equals(names[0]) ? "true" : "false") + "\n");

        // Arrays.binarySearch() -> IMPORTANT, sort FIRST!
        Arrays.sort(names); // IMPORTANT! Array must be SORTED prior to do Arrays.binarySearch()

        // https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(intArr, 20));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(intArr, 35));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Eve")); // Output: 1 -> 1. Stelle im Array
        // "Aaron", "Eve", "Mandy", "Paul"
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Mand"));
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(names, "Mandy")); // Output: 2 -> 2. Stelle im Array
        System.out.println("Arrays.binarySearch: " + ((Arrays.binarySearch(names, "Mandyer")) < -1 ? "false" : Arrays.binarySearch(names, "Mandyer")));

        // Manuel search
        System.out.println("Manuel int search: " + ((searchString("Mandy", names)) == (-1) ? "false" : searchString("Mandy", names)));
        System.out.println("Manuel int search: " + ((searchString("Mandy23", names)) == (-1) ? "false" : searchString("Mandy", names)));
    }

    static public int searchString (String searchedInt, String[] names) {
        for(int i = 0; i < names.length; i++){
            if(searchedInt.equals(names[i]))
                return i;
        }
        return -1;
    }
}
