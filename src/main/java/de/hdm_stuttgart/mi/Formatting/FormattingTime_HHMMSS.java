package de.hdm_stuttgart.mi.Formatting;

public class FormattingTime_HHMMSS {

    // Beispiel: 7290 Sekunden entsprechen 2 Stunden, einer Minute und 30 Sekunden, also "2:1:30"

    public static void main(String[] args) {
        System.out.println(getZeitangabe(1238223));
        System.out.println(getZeitangabe(231249));
    }

    static public String getZeitangabe(final long sekunden) {
        final long stunden = sekunden / (60 * 60);
        long rest = sekunden  % (60 * 60);
        long minuten = rest / 60;
        rest = rest % 60;
        return stunden + ":" + minuten + ":" + rest;
    }
}
