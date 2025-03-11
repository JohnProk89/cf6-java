package gr.aueb.cf.ch6arrays;

/**
 * Applies reducing methods
 */
public class ReducingApp {

    public static void main(String[] args) {

        // Declaration and initialization
        int[] testArray = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0;

        // Calculations
        sum = getSum(testArray);
        average = getAvg(testArray);

        // Printing results
        System.out.println(sum);
        System.out.println(average);
    }

    /**
     * Reduces the input arr to sum of its elements
     * @param arr the input array
     * @return the sum of array elements
     */
    public static int getSum(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    /**
     * Reduces the input arr to get the average of its elements
     * @param arr the input array
     * @return the average of the array elements
     */
    public static double getAvg(int[] arr) {
        if (arr == null || arr.length == 0) return -1.0;

        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return (double) sum / arr.length;
    }
}
