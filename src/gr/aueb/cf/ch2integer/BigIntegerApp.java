package gr.aueb.cf.ch2integer;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση BigInteger ώστε να μην έχουμε υπερχείλιση (overflow)
 * @author johnp
 * @since cf6
 */

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("123456789123456789");
        BigInteger myBigNum2 = new BigInteger("123456987654");

        BigInteger result = myBigNum1.add(myBigNum2);
        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d" , result);
    }
}
