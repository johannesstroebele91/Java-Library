package de.hdm_stuttgart.mi.Enum;

public class NotEnum_ClassInstance {

    // NOT enum, BUT class without instance attributes
    static public final Day
            MONDAY    = new Day("Monday"),
            TUESDAY   = new Day("Tuesday"),
            WEDNESDAY = new Day("Wednesday"),
            THURSDAY  = new Day("Thursday"),
            FRIDAY    = new Day("Friday"),
            SATURDAY  = new Day("Saturday"),
            SUNDAY    = new Day("Sunday");
            // SUNDAYasd    = new Day("Asdler"); // Compile error

    public static void main(String[] args) {

        System.out.println(Day.FRIDAY);
    }
}

