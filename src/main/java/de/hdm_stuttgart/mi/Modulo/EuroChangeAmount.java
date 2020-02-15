package de.hdm_stuttgart.mi.Modulo;

import java.util.Arrays;

public class EuroChangeAmount {

    private final int[] change = new int[Coin.values().length];

    public static void main(String[] args) {

        EuroChangeAmount currencyUnits = new EuroChangeAmount();

        currencyUnits.getCurrencyUnits(544);
        currencyUnits.getCurrencyUnits(324);
    }

    private void getCurrencyUnits(int amount) {

        int amountAdaption = 0;
        System.out.println( "\n\nNext values:");
        for (int i = change.length - 1; i >= 0; i--) {
            amountAdaption = amount % Coin.values()[i].value;
            System.out.println("amountAdaption " + amountAdaption);
            change[i] = (amount - amountAdaption) / Coin.values()[i].value;
            System.out.println(Coin.values()[i].value);
            System.out.println("change[" + i + "] " + change[i]);
            amount = amountAdaption;
        }
    }

    public enum Coin {

        /**
         * «one cent»
         */
        CENT_01(1),
        /**
         * «two cent»
         */
        CENT_02(2),
        /**
         * «five cent»
         */
        CENT_05(5),
        /**
         * «ten cent»
         */
        CENT_10(10),
        /**
         * «twenty cent»
         */
        CENT_20(20),
        /**
         * «fifty cent»
         */
        CENT_50(50),
        /**
         * «one euro»
         */
        EURO_1(100),
        /**
         * «two euro»
         */
        EURO_2(200);

        Coin(final int value) {
            this.value = value;
        }

        /**
         * The given coin's value in cent.
         */
        public final int value;
    }
}

