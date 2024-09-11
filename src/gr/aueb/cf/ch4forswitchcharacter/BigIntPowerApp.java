package gr.aueb.cf.ch4forswitchcharacter;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^b με BigInteger.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two integers");
        base = BigInteger.valueOf(in.nextInt());
        power = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }

        System.out.printf("%d^%d = %,d", base, power, result);

        //Attempt 2nd
        System.out.println();
        BigInteger base2 = BigInteger.ZERO;
        int power2 = 0;
        BigInteger result2 = BigInteger.ONE;
        System.out.println("Please insert two integers");
        base2 = BigInteger.valueOf(in.nextInt());
        power2 = in.nextInt();
        for (int i = 1; i <= power2; i++) {
            result2 = result2.multiply(base);
        }
        System.out.printf("%d^%d = %,d", base2, power2, result2);

    }
}
