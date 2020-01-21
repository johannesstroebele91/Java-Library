package de.hdm_stuttgart.mi.Enum;

public class NotEnum_String {

    /** Examples of Enum -> no dynamic change
     * A room's door: {OPEN, CLOSED}
     * State of matter: {SOLID, LIQUID, GASEOUS}
     */

    // 1) Just defining Strings
    static final String monday = "Monday";
    static final String tuesday = "Tuesday";
    static final String wednesday = "Wednesday";
    static final String thursday = "Thursday";
    static final String friday = "Friday";
    static final String saturday = "Saturday";
    static final String sunday = "Sunday";

    // 2) Solution: final and Method switch case
    // Defining days as numbers
    static public final int
            MONDAY    = 1,
            TUESDAY   = 2,
            WEDNESDAY = 3,
            THURSDAY  = 4,
            FRIDAY    = 5,
            SATURDAY  = 6,
            SUNDAY    = 7;

    // Restricting the days via method switch case -> default!
    public static String getDaysName(final int day) {
        switch (day) {
            case MONDAY:    return "Monday";
            case TUESDAY:   return "Tuesday";
            case WEDNESDAY: return "Wednesday";
            case THURSDAY:  return "Thursday";
            case FRIDAY:    return "Friday";
            case SATURDAY:  return "Saturday";
            case SUNDAY:    return "Sunday";

            default: return "Illegal day's code: " + day;
        }
    }

    public static void main(String[] args) {

        // 1) Just defining Strings
        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(3121);

        // 2) Solution: final and Method switch case
        System.out.println(NotEnum_String.getDaysName(NotEnum_String.FRIDAY));
        System.out.println(NotEnum_String.getDaysName(NotEnum_String.FRIDAY));
        System.out.println(NotEnum_String.getDaysName(9));
    }
}
