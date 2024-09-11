package gr.aueb.cf.ch5methodsfloatdouble;

/**
 *  Προσθέτει δύο ακεραίους με χρήση μεθόδου
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = AddApp.add(a,b);

        System.out.printf("%d + %d = %d\n", a, b, result);
        System.out.println("Result: " + result);
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return a + b;
    }
}
