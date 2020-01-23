package de.hdm_stuttgart.mi.Uebungen;

public class InterestCalculation {

    private double interestRate;
    private int yearsOfInvestment;
    private double initialCapital;

    private InterestCalculation(double interestRate, int yearsOfInvestment, double initialCapital) {
        this.interestRate = interestRate;
        this.yearsOfInvestment = yearsOfInvestment;
        this.initialCapital = initialCapital;
    }

    public static void main(String[] args) {

        /* We want to calculate the compounded interest
         * starting from an initial capital,
         * a given annual interest rate and
         * a duration of three years
         */

        InterestCalculation investment3years = new InterestCalculation(1.5, 3, 223.12);
        double factor = investment3years.calculateFactor(investment3years);

        // 1) Solution: short
        System.out.println("Short: Capital after three years:" + investment3years.initialCapital * (Math.pow ( (1 + investment3years.getInterestRate()/100), investment3years.getYearsOfInvestment())));
    }

    private void setInterestRate(double interestRate) {  // Scope of variable "z" limited to
        // just the current block {...},
        this.interestRate = interestRate;                             // in contrast interestRate has class scope.
    }
    private double getInterestRate(){
        return this.interestRate;
    }
    private double getYearsOfInvestment(){
        return this.yearsOfInvestment;
    }
    private double calculateFactor(InterestCalculation investment3years){
        return 1 + investment3years.getInterestRate()/100;
    }
}
