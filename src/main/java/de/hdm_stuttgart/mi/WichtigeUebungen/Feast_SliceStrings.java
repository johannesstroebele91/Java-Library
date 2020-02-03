package de.hdm_stuttgart.mi.WichtigeUebungen;

public class Feast_SliceStrings {

    // Different goal: comparing the first letters of both words

    public static void main(String[] args) {
        System.out.println("Each animal is allowed to bring one dish.");
        System.out.println("The catch is that it needs to consist of 2 words and");
        System.out.println("they have to start with the same letter.\n");

        String input1 = "garlic naan";
        String input2 = "chocolate cake";

        compareChars(input1);
        compareChars(input2);

    }

    private static void compareChars(String input){

        String[] firstWord = null;
        String[] secondWord = null;
        char firstLetter1word = ' ';
        char firstLetter2word = ' ';

        // Print out word
        System.out.println("The name of the dish is " + input);

        // gets the first char
        firstLetter1word = input.charAt(0);
        System.out.println("1. letter: " + firstLetter1word);


        for (int i = 0; i < input.length(); i++){
            secondWord = input.split(" ");
            firstLetter2word = secondWord[1].charAt(0);
        }
        System.out.println("2. letter: " + firstLetter2word);

        // Comparison between 2 first letters

        if (firstLetter2word == firstLetter1word) {
            System.out.println("Right! The 2 words start with the same letter");
        }
        else {
            System.out.println("Wrong! The 2 words doesn't start with the same letter");
        }
        System.out.println();
    }
}
