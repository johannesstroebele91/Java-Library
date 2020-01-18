package de.hdm_stuttgart.mi.Classes_Objects;

import java.util.Objects;

public class Bicycle {

    /** STRUCTURE
     * Class variables / Instance variables
     * Class methods / Member variables
     * Constructor
     * Getter & Setter
     * toString()
     * hashcode() & equals()
     */

    // Instance variables
    private int gear;
    private int speed;
    private int cadence;
    private int id;

    // Static instance variable
    // -> independent from number of objects!
    private static int numberOfBicycles = 0;

    // Class method to return the ID instance variable
    public int getID() {
        return id;
    }

    // CONSTRUCTOR
    // No-Args-Constructor
    public Bicycle() {}

    // 2-Args-Constructor (created automatically via Code -> Generate -> Constructor)
    public Bicycle(int gear, int speed, int cadence, int id) {
        this.gear = gear;
        this.speed = speed;
        this.cadence = cadence;
        this.id = id;

        // increment number of Bicycles
        // and assign ID number
        // every time a new bicycle gets added
        id = ++numberOfBicycles;
    }


    // GETTER & SETTER (created automatically via Code -> Generate -> Getter & setter)
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public static void setNumberOfBicycles(int numberOfBicycles) {
        Bicycle.numberOfBicycles = numberOfBicycles;
    }

    // COMPARISON
    // hashcode (created automatically via Code -> Generate -> hashcode() & equals())
    @Override
    public int hashCode() {
        return Objects.hash(gear, speed, cadence, id);
    }

    // equals (created automatically via Code -> Generate -> hashcode() & equals())
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return gear == bicycle.gear &&
                speed == bicycle.speed &&
                cadence == bicycle.cadence &&
                id == bicycle.id;
    }


    // METHOD OVERLOADING
    public int rideBicycle(){
        return speed; // Access class variables in methods
    }

    public int rideBicycle(int travelTime){
        return travelTime*speed; // Access class variables in methods
    }

    public double rideBicycle(double travelTime, int travelDistance){
        return travelTime*travelDistance*speed; // Access class variables in methods
    }


    // TOSTRING
    // toString() (created automatically via Code -> Generate -> toString())
    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                ", cadence=" + cadence +
                ", id=" + id +
                '}';
    }

}