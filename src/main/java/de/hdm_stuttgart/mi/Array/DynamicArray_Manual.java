package de.hdm_stuttgart.mi.Array;

import java.util.Arrays;

public class DynamicArray_Manual {

    public static void main(String[] args) {

        // Relevance -> Arrays are immutable
        final String[] members = {"Eve", "John", "Peter", "Jill"};
        System.out.println("Members before " + Arrays.toString(members));
        // member.length = 5; // Error: Size unchangeable

        // 1) Solution: manual with Arrays.copyOf()
        final String newMember1 = "Ernest";
        String[] membersNewCopyOf = add(members, newMember1);
        System.out.println("Members afterwards with copyOf() " + Arrays.toString(membersNewCopyOf));

        // 2) Solution: completely manual
        final String newMember2 = "Lena";
        String[] membersNewManual = append(members, newMember2);
        System.out.println("Members afterwards with manual " + Arrays.toString(membersNewManual));

        // Continuously enlarge array based on condition
        int[] result = {};
        for (int i = members.length-1; i >= 0; i--) {
            System.out.println( "i " + i);
            result = add(result, i);
            System.out.println("Members while for loop " + Arrays.toString(result));
        }
        System.out.println("Members afterwards with for loop " + Arrays.toString(result));
    }

    // 1) String Method for solution: manual with Arrays.copyOf()
    static int[] add (final int[] values, final int newValue) {
        final int[] copy = Arrays.copyOf(values, values.length + 1);
        copy[values.length] = newValue;
        return copy;
    }

    // 1) Int Method for solution: manual with Arrays.copyOf()
    static String[] add (final String[] values, final String newValue) {
        final String[] copy = Arrays.copyOf(values, values.length + 1);
        copy[values.length] = newValue;
        return copy;
    }

    // 2) Method for solution: completely manual
    static String[] append (final String[] values, final String newValue){
        final String[] copy = new String[values.length+1];
        // 1) Copying old values
        for (int i = 0; i < values.length; i++) {
            copy[i] = values[i];
        }
        // 2) Inserting new value
        copy[copy.length-1] = newValue;
        return copy;
    }
}
