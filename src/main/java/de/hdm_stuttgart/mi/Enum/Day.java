package de.hdm_stuttgart.mi.Enum;

public class Day {
    private final String name;

    public Day(final String name) {
        this.name = name;
    }
    static public final Day
            MONDAY    = new Day("Monday"),
            TUESDAY    = new Day("Tuesday"),
            WEDNESDAY    = new Day("Wednesday"),
            THURSDAY    = new Day("Thursday"),
            FRIDAY    = new Day("Friday"),
            SATURDAY    = new Day("Saturday"),
            SUNDAY    = new Day("Sunday");

    public String toString() { return name; }
}

