package de.hdm_stuttgart.mi.Classes_Objects;

import java.util.Objects;

public class Bicycle {

    /** STRUCTURE
     * Class/Instance variables
     * Class methods
     * Static variables
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
    static private int numberOfBicycles = 0;

    // Class method to return the ID instance variable
    public int getID() {
        return id;
    }

    // https://www.geeksforgeeks.org/polymorphism-in-java/

    // CONSTRUCTOR (always a overloaded Method if multiple ones)
    // No-Args-Constructor
    public Bicycle() {}

    // NEEDS TO BE PUBLIC!!!!
    // 2-Args-Constructor (created automatically via Code -> Generate -> Constructor)
    public Bicycle(int gear, int speed, int cadence, int id) {

        /* great == gear // compile error!
         * assignment gear = gear will assign the constructor's argument gear to itself
         * rather than assigning it to the instance variable gear being defined within class scope
         *-> This scope conflict can be resolved using this!
         */

        this.gear = gear;
        this.speed = speed;
        this.cadence = cadence;
        this.id = id;

        // increment number of Bicycles
        // and assign ID number
        // every time a new bicycle gets added
        ++numberOfBicycles;
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