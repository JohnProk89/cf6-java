package gr.aueb.cf.ch5methodsfloatdouble;

/**
 * Recursive version of factorial
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Facto: " + facto(n));
    }

    /**
     *
     * @param n
     * @return
     */
    public static int facto(int n) {
//        if (n <= 1) return 1;
//
//        return n * facto(n-1);

        return (n <= 1) ? 1 : n * facto(n - 1);
    }
}
