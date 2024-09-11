package gr.aueb.cf.ch3whileifboolean;

import java.util.Scanner;

/**
 *  Διαβάζει από το standard in ένα ακέραιο που συμβολίζει μία θερμοκρασία
 *  και ελέγχει αν η θερμοκρασία είναι μικρότερη από 0.
 *  Εκτυπώνει το αποτέλεσμα.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBellowZero = false;

        System.out.println("Please insert the temperature (integer)");
        temp = in.nextInt();

        isTempBellowZero = temp < 0;

        System.out.println("Temp is below zero: " + isTempBellowZero);
    }
}
