package de.hdm_stuttgart.mi.Operators;

public class Modulo_Beispiel_Nico {

    public int einer;
    public int zehner;
    public int hunderter;

    public Modulo_Beispiel_Nico(int input){
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

        System.out.println(new Modulo_Beispiel_Nico(327).toString());

    }
}
