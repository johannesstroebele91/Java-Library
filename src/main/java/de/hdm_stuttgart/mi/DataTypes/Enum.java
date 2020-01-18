package de.hdm_stuttgart.mi.DataTypes;

public class Enum {

    final int mon = 1;
    final int die = 2;
    final int mit = 3;
    final int don = 4;
    final int fre = 5;
    final int sam = 6;
    final int son = 7;
    // ...

    // Nur vorgegebene Werte
    // 1) Scanner input
    // 2) Scanner input in einem ENUM casten
    // 3)

    public enum Day {

        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Tuesday"),
        THURSDAY("Tuesday"),
        FIRDAY("Tuesday"),
        SATURDAY("Tuesday"),
        SUNDAY("Sunday");

        final String name;
        Day(final String name) {
            this.name = name;}

        public String toString() {
            return name;}
    }

    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
    }
}
