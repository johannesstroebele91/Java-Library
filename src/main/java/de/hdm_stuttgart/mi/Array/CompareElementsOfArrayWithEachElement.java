package de.hdm_stuttgart.mi.Array;

public class CompareElementsOfArrayWithEachElement {

    public static void main(String[] args) {

        // Compare Int Elements
        compareIntElemetsOfArrayWithOtherElements(new int[]{1, 2, 1, 9, -30, 1});
        // Compare String Elements
        compareStringElemetsOfArrayWithOtherElements(new String[]{"test", "asd", "asdjkx", "test", "asd", "test"});

    }

    static private void compareIntElemetsOfArrayWithOtherElements(int[] values){
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[i] != values[j + 1]) {
                    System.out.println(values[i] + " not the same with  " + values[j + 1] + "\n");
                } else {
                    System.out.println(values[i] + " is the same with  " + values[j + 1] + "\n");
                }
            }
        }
    }
    static private void compareStringElemetsOfArrayWithOtherElements(String[] values){
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[i].equals(values[j + 1])) {
                    System.out.println(values[i] + " not the same with  " + values[j + 1] + "\n");
                } else {
                    System.out.println(values[i] + " is the same with  " + values[j + 1] + "\n");
                }
            }
        }
    }

}
