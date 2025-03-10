package gr.aueb.cf.ch10structuredprogramming.pdf10;

public class NotPaired2 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 3, 2, 1};
        int result = 0;

        for (int num : arr) {
            // Το XOR ακυρώνει τα ζεύγη όμοιων αριθμών
            result ^= num;
        }
        System.out.println("Result: " + result);
    }
}
