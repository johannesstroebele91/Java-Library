package de.hdm_stuttgart.mi.Strings;

import java.util.Arrays;

public class StringFunctions {

    public static void main(String[] args) {

        // .indexOf()
        // Find out where certain parts of words are
        String name = "Luisa";
        System.out.println( "name.indexOf(\"is\") " + name.indexOf("is"));

        // .chartAt()
        // get single letter at a certain position
        System.out.println(name.charAt(1));

        // .concat()
        // adds a String to another existing String
        // e.g. Luisa + Müller -> Luisa Müller
        System.out.println(name.concat(" Müller"));

        // .split()
        String str = "geekss@for@geekss";
        String[] arrOfStr1 = str.split("@", 2);
        System.out.println(arrOfStr1[0] + " " + arrOfStr1[1]); // index 2 is out of bounds, because only 2 words splitted

        String[] arrOfStr2 = str.split("@", 3);
        System.out.println(arrOfStr2[0] + " " + arrOfStr2[1] + " " + arrOfStr2[2]); // index 3 is out of bounds, because only 3 words splitted

        // .contain()
        // https://www.geeksforgeeks.org/java-string-contains-method-example/
        String links = "hello";
        String rechts = "hello world";
        System.out.println( "links.contains(rechts)" + rechts.contains(links));

        // .replace() ' ' with '_'
        System.out.println( "rechts.replace(' ', '_') -> " + rechts);
        rechts = rechts.replace(' ', '_');
        System.out.println( "rechts.replace(' ', '_') -> " + rechts);
        // String.format
        double d = 4.298238;
        System.out.println( "String.format(\"%.2f\", c)" + String.format("%.2f", d)); // nur Format
        System.out.println( "String.format(\"%.3f\", c)" + String.format("%.3f", d)); // nur Format

        // Leerzeichen finden
        String input = "Ein schöner warmer Sommer steht an";
        if (input == null)
            System.out.println("return null");
        else {
            final char[] copy = input.toCharArray();

            for(int i = 0; i<copy.length; i++){
                if(copy[i] ==' ')
                    copy[i+1] = Character.toLowerCase(copy[i+1]);
            }
            System.out.println("new String(copy)"); // alt. copy.toString()
        }

        // .toUpperCase / .toLowerCase
        // Make letters lower or upper case
        System.out.println(name.toUpperCase() );

        // substring()
        // Cuts out the specified string, whereby the 2. paramter is EXCLUSIVE! -> e.g. 0,3 -> index 0 bis index 2
        System.out.println( "name.substring(0,3) " + name.substring(0,3));
        // Only gets string starting from index 2 INCLUSIVELY!
        System.out.println( "name.substring(2) " + name.substring(2));

        // Binary search of Strings
        String [] animalKinds = {"dog","cat", "hamster","snake","elephant"};
        Arrays.sort(animalKinds);
        System.out.println( "Arrays.sort(animalKinds) " + Arrays.toString(animalKinds)); // 1) The array needs to be SORTED before a binary search
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(animalKinds, "hamsters")); // Output: -5 -> not found
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(animalKinds, "hamste")); // Output: -4 -> not found
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(animalKinds, "hamster")); // Output: 3
        // Therefore, the key "hamster" is at the index 3

        // compareTo()
        String s1 = "geeksforgeeks";
        String s2 = new String("geeksforgeeks");
        String s3 = new String("asthae");
        String s4 = new String("geeksfor");
        String s5 = new String("geeksforgeeksfor");

        System.out.print("Difference of geeksforgeeks(obj) and geeksforgeeks(str) : ");
        System.out.println(s1.compareTo(s2)); // Output: 0 -> equals 0 if the argument is a string lexicographically "s2" equal to this string;
        System.out.print("Difference of geeksforgeeks(str) and astha(obj): ");
        System.out.println(s1.compareTo(s3)); Output: // Output: 6 -> greater than 0 if the argument is a string lexicographically "s3" less than this string
        System.out.print("Difference of geeksforgeeks(obj) and geeksfor(str) : ");
        System.out.println(s1.compareTo(s4)); // Output:  5 -> greater than 0 if the argument is a string lexicographically "s4" less than this string
        System.out.print("Difference of geeksforgeeks(obj) and geeksforgeeksfor(str) : ");
        System.out.println(s1.compareTo(s5)); // Output: -3 -> less than 0 if the argument is a string lexicographically "s5" greater than this string

        String a = new String("4");
        String b = new String("4");
        String c = new String("1");
        System.out.println(a.compareTo(b)); // Output: 0
        System.out.println(a.compareTo(c)); // Output: 3 -> greater than 0 if the argument is a string "c" lexicographically less than this string
        System.out.println(c.compareTo(a)); // Output: -3 -> less than 0 if the argument is a string "a" lexicographically greater than this string
    }
}
