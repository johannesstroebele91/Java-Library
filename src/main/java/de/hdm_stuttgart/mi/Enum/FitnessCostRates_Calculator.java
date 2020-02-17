package de.hdm_stuttgart.mi.Enum;

abstract public class FitnessCostRates_Calculator {

    public static void main(String[] args) {

        // Calculate fitness cost rates
        System.out.println( "\ngetCosts_PERVISIT_Rate(12): " + getCosts_PERVISIT_Rate((short)12));
        System.out.println( "getCosts_MIXED_Rate(12): " + getCosts_MIXED_Rate((short)12));
        System.out.println( "getOptimalRateType(12): " + getOptimalRateType((short)12));

    }

    // Enum
    public enum FitnessCostRates {
        // Defining enums
        PERVISIT(0, 12),
        MIXED(150, 5),
        YEARLYFLAT(800, 0);


        // Constructor: setting values of enums
        FitnessCostRates(int costYearly, int costsPerVisit) {
            this.costsYearly = costYearly;
            this.costsPerVisit = costsPerVisit;

            System.out.println("Yearly costs:" + costYearly);
        }

        // Making instances accessibly from outside (getter)
        public final int costsYearly;
        public final int costsPerVisit;
    }


    // METHODS
    // getCosts_PERVISIT_Rate
    static public int getCosts_PERVISIT_Rate(final short visitsPerYear) {
        if (visitsPerYear < 0)
            return 0;
        else
            return FitnessCostRates.PERVISIT.costsYearly + visitsPerYear * FitnessCostRates.PERVISIT.costsPerVisit;
    }

    // getCosts_MIXED_Rate
    static public int getCosts_MIXED_Rate(final int visitsPerYear) {
        if (visitsPerYear < 0)
            return FitnessCostRates.MIXED.costsYearly;
        else
            return FitnessCostRates.MIXED.costsYearly + visitsPerYear * FitnessCostRates.MIXED.costsPerVisit;
    }

    // getOptimalRateType
    static public FitnessCostRates getOptimalRateType(final short visitsPerYear) {

        int costsPerVisit = getCosts_PERVISIT_Rate(visitsPerYear);
        int costsMixed = getCosts_MIXED_Rate(visitsPerYear);
        int costsYearlyFlatrate = FitnessCostRates.YEARLYFLAT.costsYearly;

        if (costsPerVisit <= costsMixed && costsPerVisit <= costsYearlyFlatrate)
            return FitnessCostRates.PERVISIT;
        else if (costsMixed <= costsYearlyFlatrate)
            return FitnessCostRates.MIXED;
        else {
            return FitnessCostRates.YEARLYFLAT;
        }
    }
}