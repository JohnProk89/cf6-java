package gr.aueb.cf.ch2integer;

import java.util.Locale;

/**
 *  Output Demo
 *
 * @author johnp
 */

public class OutputApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 202345676;

/*        System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);*/
        System.out.printf(Locale.forLanguageTag("el"), "Num is: %04d, Num2 is %,4d", num, num2);
    }
}
