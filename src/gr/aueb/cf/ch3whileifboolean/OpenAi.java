package gr.aueb.cf.ch3whileifboolean;

import java.util.Scanner;

public class OpenAi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year to check if it is a leap year:");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("It is a leap year: " + isLeapYear);
    }
}
