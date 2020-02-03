package de.hdm_stuttgart.mi.WichtigeUebungen;

public class TimeUnitConversion_WeeksIntoSeconds {
    public static void main(String[] args) {

        final short weeks = 2,
                    days = 3,
                    hours = 14,
                    minutes = 32,
                    seconds = 55;

        final int secondsElapsed = seconds + 60*minutes+ hours*60*60 + days *60*60*24 + weeks*7*60*60*24;

        System.out.println(secondsElapsed);
    }
}

