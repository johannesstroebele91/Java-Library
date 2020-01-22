package de.hdm_stuttgart.mi.Strings;

public class StringFunctions {

    public static void main(String[] args) {

        // .indexOf()
        // Find out where certain parts of words are
        String name = "Luisa";
        System.out.println(name.indexOf("is"));

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
        System.out.println(links.contains(rechts));

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

        // Make first letter of both words upper case
        // 1) using substring()
        String sFirstLarge1 = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(sFirstLarge1);
        String sFirstLarge2 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(sFirstLarge2);

        // 2) using charAt()
        String sFristLarge3 = name.toUpperCase().charAt(0) + name.substring(1);
        System.out.println(sFristLarge3);
    }
}
