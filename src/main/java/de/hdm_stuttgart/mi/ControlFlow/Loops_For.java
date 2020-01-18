package de.hdm_stuttgart.mi.ControlFlow;

public class Loops_For {

    public static void main(String[] args) {

        // For
        String[] stringArray = new String[]{"hello", "world"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        // For-each: Warning: VALUE! not index
        System.out.println("\nFor-each?");
        for (String s : stringArray) {
            System.out.println(s);
        }

        // Example: Swaping values
        System.out.println("\nSwap values?");
        int[] werte = {1, 2, 3, 4, 5};
        for (int i = 0; i < (werte.length-1); i++) {
            final int tempWert = werte[i];
            werte[i] = werte[i + 1];
            werte[i + 1] = tempWert;
        }

        // Example: looping 2-dimensional array
        System.out.println("\nlooping 2-dimensional array");
        int array2Dim[][] = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 } };
        // For each i, loop through all j
        for (int i = 0; i < array2Dim.length; i++) {
            for (int j = 0; j < array2Dim.length; j++)
                System.out.println(array2Dim[i][j] + " ");
        }

        // Example: Duplicates (Exam SE1)
        // Better readability: Use row and column in favour of i and j
        System.out.println("\nAre there dubplicates?");
        boolean duplikate = false;
        for (int row = 0; row < werte.length; row++) {
            for (int column = 0; column < werte.length; column++){
                if (row == column)
                    continue; // continue jumps to the next iteration
                else {
                    if(werte[column] == werte[row])
                        duplikate = true;
                }
            }
        }
        System.out.println("There are duplicates -> " + duplikate);


        // Example: print only even numbers
        System.out.println("\nprint only even numbers");
        for (int i = 0; i <werte.length; i++) {
            if (werte[i] % 2 == 0)
                System.out.println(werte[i]);
        }
    }
}
