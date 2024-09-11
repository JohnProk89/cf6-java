package gr.aueb.cf.ch8exceptions.exercise;

import java.util.Scanner;

public class ChatGPT {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaration and Initialization
        int choice = 0;

        // Calculations
        while (true) {
            showMenu();
            choice = getChoice();
            try {
                if (choice >= 1 && choice <= 5) {
                    if (choice == 5) {
                        break;
                    }
                    printChoice(choice);
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Please provide an integer value between 1 and 5.");
//                e.printStackTrace();
            }
        }
    }

    /**
     * Prints a menu
     */
    public static void showMenu() {
        System.out.println("Type one of the following choices:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5 to exit");
    }

    /**
     * Takes user input
     * @return the user's choice
     */
    public static int getChoice() {
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Error in input: Please enter an integer.");
            scanner.next(); // Clear the invalid input
        }
        return choice;
    }

    /**
     * Prints user choice
     * @param choice the user's choice
     */
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 4) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("User choice: " + choice);
        }
    }
}
