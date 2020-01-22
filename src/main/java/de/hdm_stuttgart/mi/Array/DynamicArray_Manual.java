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
        String[] membersNew = add(members, newMember1);
        System.out.println("Members afterwards " + Arrays.toString(membersNew));

        // 2) Solution: completely manual
        final String newMember2 = "Lena";
        String[] membersNewest = append(members, newMember2);
        System.out.println("Members afterwards " + Arrays.toString(membersNew));
    }

    // 1) Method for solution: manual with Arrays.copyOf()
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
