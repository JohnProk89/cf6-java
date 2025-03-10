package gr.aueb.cf.ch10structuredprogramming.pdf10.maxzeros;

public class MaxZeros {

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(Integer.toBinaryString(n));
        int max = maxZeros(n);
        System.out.println(max);
    }

    private static int maxZeros(int n) {
        int count = 0;
        boolean oneFlag = false;
        int max = 0;

        for (; n > 0; n >>= 1) {
            // if rightmost bit is one
            if (n % 2 != 0) {
                oneFlag = true;
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else if (oneFlag) {
                count++;
            }
        }

        return max;
    }
}
