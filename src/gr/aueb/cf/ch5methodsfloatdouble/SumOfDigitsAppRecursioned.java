package gr.aueb.cf.ch5methodsfloatdouble;

/**
 * Attempt to develop the SumOfDigitsApp with recursion
 *
 */
public class SumOfDigitsAppRecursioned {
    static int rightDigit = 0;
    static int sum = 0;
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(sumOfDigits(num));
    }

    /**
     * something
     * @param left
     * @return
     */
    public static int sumOfDigits(int left) {
        rightDigit = left % 10;
        sum += rightDigit;
        left = left / 10;

        if (left == 0) {
            return sum;
        }

       return sumOfDigits(left);
    }
}
