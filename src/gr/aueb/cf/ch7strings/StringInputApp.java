package gr.aueb.cf.ch7strings;

import java.util.Scanner;

/**
 * Reads String from the standard input
 */
public class StringInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Please insert a string that ends with whitespace (enter/tab/space)");
        string = scanner.next();
        scanner.nextLine(); // consumes the new line character(string)
        System.out.println(string);

        System.out.println("Please insert a new string that ends with enter");
        string = scanner.nextLine();
        System.out.println(string);
    }
}
