package de.hdm_stuttgart.mi;

public class JavaDoc {

    // The following comment is a special format comment used by javadoc to generate documentation
    /**
     *
     */

    // Example
    /** : explanation of the method
     * @param originalArray explanation of the parameter "originalArray"
     * @param index explanation of the parameter "index"
     * @return explanation of the return value
     */
    public static String[] splitArray(String[] originalArray, int index)
    {
        String[] newArray = new String[0];
        for (int i = 0; i < originalArray.length; i++) {
            String[] splitArray = originalArray[i].split(";");
        }
        return newArray;
    }
}
