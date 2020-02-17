package de.hdm_stuttgart.mi.ControlFlow;

public class SwitchCase {

    public static void main(String[] args) {

        int i = 2;
        // 1) Switch case
        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            default:
                System.out.println("no number");
        }

        // Case multiple values
        String wochentag = "Montag";
        int stundenLohn = 0;

        switch (wochentag) {

            case "Montag":
            case "Dienstag":
            case "Mittwoch":
            case "Donnerstag":
            case "Freitag":
                stundenLohn = 15;
                break;

            case "Samstag":
            case "Sonntag":
                stundenLohn = 20;
                break;

            default:
                stundenLohn = 0;
        }

        // Text in switch case
        String month = "April";
        String season = "";
        // Multiple cases
        switch (month) {
            case "March":
            case "April":
            case "May":
                season = "Spring";
                break;

            case "June":
            case "July":
            case "August":
                season = "Summer";
                break;

            case "September":
            case "October":
            case "November":
                season = "Autumn";
                break;

            case "December":
            case "January":
            case "February":
                season = "Winter";
                break;
        }
    }
}
