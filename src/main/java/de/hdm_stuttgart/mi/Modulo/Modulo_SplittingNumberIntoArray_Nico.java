package de.hdm_stuttgart.mi.Modulo;

public class Modulo_SplittingNumberIntoArray_Nico {

    private int einer;
    private int zehner;
    private int hunderter;

    private Modulo_SplittingNumberIntoArray_Nico(int input){
        einer = input % 10;
        zehner = (input % 100 - einer) /10;
        hunderter = (input % 1000 - einer - zehner) /100;
    }

    @Override
    public String toString() {

        return "Operators{" +
                "einer=" + einer +
                ", zehner=" + zehner +
                ", hunderter=" + hunderter +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(new Modulo_SplittingNumberIntoArray_Nico(327).toString());

    }
}
