package de.hdm_stuttgart.mi.WichtigeUebungen;

// Program for determining the probabilistic success rate for the lottery "Glücksspirale"
// https://freedocs.mi.hdm-stuttgart.de/sd1SectPlayingLottery.html#sd1QandaPlayingLottery
public class Lottery {

    public static void main(String[] args) {

        // Input values:
        final int
                totalNumberCount = 49,
                drawnNumberCount = 6;

        // No changes below this line


        // Numerator loop
        long numerator = 1;
        for (int i = totalNumberCount - drawnNumberCount + 1;
             i <= totalNumberCount; i++) {
            numerator *= i;
        }

        // Denominator loop calculating the "smaller" factorial
        long factorial = 1;
        for (int i = 2; i <= drawnNumberCount; i++) {
            factorial *= i;
        }

        System.out.println("Your chance to win when drawing " + drawnNumberCount +
                " out of " + totalNumberCount + " is 1 : " + (numerator / factorial));
    }
}