package de.hdm_stuttgart.mi.WichtigeUebungen;

public class TimeUnitConversion_SecondsIntoWeeks {

    public static void main(String[] args) {

        final int secondsElapsed = 1521175;

        final int secondsPerMinute = 60,
                secondsPerHour = 60* secondsPerMinute,
                secondsPerDay = 24 * secondsPerHour,
                secondsPerWeek = 7* secondsPerDay;

        int remainingSeconds = secondsElapsed;

        final int weeks = remainingSeconds / secondsPerWeek;
        remainingSeconds = remainingSeconds % secondsPerWeek;

        final int days = remainingSeconds / secondsPerDay;
        remainingSeconds %= secondsPerDay;

        final int hours = remainingSeconds / secondsPerHour;
        remainingSeconds %= secondsPerHour;

        final int minutes = remainingSeconds / secondsPerMinute;
        remainingSeconds %= secondsPerMinute;

        final int seconds = remainingSeconds;

        System.out.println(weeks + ", " + days + ", " + hours + ", " + minutes + ", " + seconds);

    }
}
