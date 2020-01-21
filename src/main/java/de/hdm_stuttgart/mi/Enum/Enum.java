package de.hdm_stuttgart.mi.Enum;

public class Enum {

    /** Examples of Enum -> no dynamic change
     * A room's door: {OPEN, CLOSED}
     * State of matter: {SOLID, LIQUID, GASEOUS}
     */

    public enum EnumDay {

        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        final String name;

        EnumDay(final String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }


    // switch statements working again
    public static String getDaysName(final EnumDay day) {
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
        System.out.println(getDaysName(EnumDay.FRIDAY));
        System.out.println(getDaysName(EnumDay.MONDAY));
    }
}

