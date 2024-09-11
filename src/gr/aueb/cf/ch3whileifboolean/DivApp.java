package gr.aueb.cf.ch3whileifboolean;

import java.util.Scanner;

/**
 * Μία απλή διαίρεση. Διαίρεση με 0 απαγορεύεται στους ακεραίους της Java. Δίνει ArithmeticException.
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denumerator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

//
//        if (denominator != 0) {
//            if (numerator != 0) {
//                result = numerator / denominator;
//            } else {
//                System.out.println("Numerator can not be zero");
//            }
//        } else {
//            System.out.println("Denominator can not be zero");
//        }
//        if (denominator == 0) {
//            System.out.println("Denominator can not be zero");
//            System.exit(1);
//        }

//        result = numerator / denominator;
//        System.out.println("Result " + result);
//

        // Error conditions
        if (denominator == 0 ) {
            System.out.println("Error. Denominator is zero");
            System.exit(1);
        }

        if (numerator == 0 ) {
            System.out.printf("Error. Nominator is zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("Result " + result);

    }
}
