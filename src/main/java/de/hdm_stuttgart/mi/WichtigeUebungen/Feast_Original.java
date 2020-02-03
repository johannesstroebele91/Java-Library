package de.hdm_stuttgart.mi.WichtigeUebungen;

public class Feast_Original {

    /** All of the animals are having a feast!
     * Each animal is bringing one dish.
     * There is just one rule: the dish must start and
     * end with the same letters as the animal's name.
     *
     * For example, the great blue heron is
     * bringing garlic naan and the chickadee is bringing chocolate cake.
     *
     * Write a function feast that takes the animal's name and dish as arguments and
     * returns true or false to indicate
     * whether the beast is allowed to bring the dish to the feast.
     */

    // great blue heron is bringing garlic naan -> g -> n und n
    // chickadee is bringing chocolate cake -> c -> c und c

    public static void main(String[] args) {
        String beast = "chickadee";
        String dish = "chocolate cake";
        feast(beast, dish);
    }

    private static boolean feast(String beast, String dish) {

        char firstLetterBeast = beast.charAt(0);
        char lastLetterBeast = beast.charAt(beast.length()-1);

        char firstLetterDish = dish.charAt(0);
        char lastLetterDish = dish.charAt(dish.length()-1);

        if ((firstLetterBeast == firstLetterDish) && (lastLetterBeast == lastLetterDish)) {
            System.out.println("The beast can bring its dish");
            return true;
        }
        System.out.println("The beast cannot bring its dish");
        return false;
    }

}
