package gr.aueb.cf.ch5methodsfloatdouble;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή όχι
 */
public class IsEvenApp {

    public static void main(String[] args) {
        int num = 11;
        boolean isEven = false;

        isEven = isEven(num);

        System.out.printf("%d is even: %b\n", num, isEven);
        System.out.printf("%d is %seven", num, isEven ? " ": "not ");
    }

    /**\
     * Returns true if the input number is even, or false if the input is odd
     *
     * @param num the input number
     * @return true, if the input number is even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
