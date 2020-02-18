package de.hdm_stuttgart.mi.Array;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        int intArr[] = {10,20,15,22,35};
        final String[] names = {"Eve", "Aaron", "Paul", "Mandy"};

        // .toString
        System.out.println("Arrays.toString(): " + Arrays.toString(intArr));
        System.out.println("Arrays.toString(): " + Arrays.toString(names) + "\n");

        // .sort
        Arrays.sort(intArr);
        System.out.println( "Arrays.sort(): " + Arrays.toString(intArr));
        Arrays.sort(names);
        System.out.println( "Arrays.sort(): " + Arrays.toString(names) + "\n");

        // .fill(names, "N.N") -> überschreibt
        final String[] namesCopy = {"Eve", "Aaron", "Paul", "Mandy"};
        System.out.println( "Arrays.fill() replaces... " + Arrays.toString(namesCopy));
        Arrays.fill(namesCopy, "N.N");
        System.out.println("... with: " + Arrays.toString(namesCopy) + "\n");

        // .copyOfRange() -> creates a copy of elements from index "2" to index "5"
        System.out.println("Before : " + Arrays.toString(intArr));
        System.out.println( "Arrays.copyOfRange(intArr,2,5) from index 2 to 5: " + Arrays.toString(Arrays.copyOfRange(intArr, 2, 5)) + "\n");

        // .copyOfRange() -> creates a copy of elements from index "2" to index "5"
        System.out.println(".equals(): " + ( names[0].equals(names[3])  ? "true" : "false"));
        System.out.println(".equals(): " + ( names[0].equals(names[0]) ? "true" : "false") + "\n");

        // .copyOf( arrOld, arrOld.length + 1 )
        int[] arrOld = {1,2,3,4,5};
        final int[] copy = Arrays.copyOf(arrOld, arrOld.length + 1);
        copy[arrOld.length] = 6;
    }
}
