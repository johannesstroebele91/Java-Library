package de.hdm_stuttgart.mi.Strings;

public class CountStringInStringArray {

    public static void main(String[] args) {

        // List of strings
        String [] listOfStrings = {"hello", "world", "hello", "world", "world", "hello"};

        // Searched string
        String searchedString = "hello";

        // Display the counter for that particular word
        System.out.println(countStringInStringArray(listOfStrings, searchedString));

    }

    static private int countStringInStringArray(String[] listOfStrings, String searchedString){
        int count = 0;
        for(String string : listOfStrings){
            if(string.equals(searchedString))
                count++;
        }
        return count;
    }
}
