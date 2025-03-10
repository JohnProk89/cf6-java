package gr.aueb.cf.ch10structuredprogramming.pdf10.cryptography;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Challenged and attempted a solution or two...
 */
public class Cryptography {
    public static void main(String[] args) {

        final int KEY = 128;
        String test = "TEST#";

        //Cipher Algorithm------------------------------------------------------------

        System.out.print(test + " is ciphered into: ");
        System.out.println(encrypt(test, KEY));

        // Decipher Algorithm------------------------------------------------------------------------
        System.out.print("It is then deciphered into: ");
        System.out.println(decrypt(encrypt(test, KEY), KEY)); // Out Of Bounds...
    }

    /**
     * @param message the message to cipher
     * @param key     the key to use in the cipher algorithm
     * @return List of integers
     */
    public static ArrayList<Integer> encrypt(String message, int key) {

        Integer [] testArray = new Integer[message.length()];
        ArrayList<Integer> integerArrayList = new ArrayList<>(message.length());
        int dividend;

        for (int i = 0; i < message.length(); i++) {
            testArray[i] = (int) message.charAt(i);
        }

        for (int i = 1; i < testArray.length; i++) {
            testArray[i] = testArray[i] + testArray[i - 1];
        }

        for (int i = 1; i < testArray.length; i++) {
            dividend = testArray[i];
            while ((dividend - key > 0)) {
                dividend -= key;
            }
            testArray[i] = testArray[i] % key;
        }

        integerArrayList.addAll(Arrays.asList(testArray));
        integerArrayList.add(-1);

        return integerArrayList;
    }

    /**
     * Decrypts a ciphered message
     * @param cipher the encrypted message
     * @param key the key to use in the algorithm of decryption/encryption
     * @return the decrypted message
     */
    public static String decrypt(ArrayList<Integer> cipher, int key) {

        StringBuilder sb = new StringBuilder();

        for (int i = cipher.size() - 1; i > 0; i--) {
            cipher.set(i, (cipher.get(i) - cipher.get(i - 1) + key) % key);
        }

        for (int i = 0; i < cipher.size() - 1; i++) {
            sb.append(((char) (int) cipher.get(i)));
        }

        return sb.toString();
    }
}
