package gr.aueb.cf.ch6arrays;

public class MinArray {

    public static void main(String[] args) {
        int [] arr = {7, 3, 9, 6, 2, 12};
        int minPosition;

        minPosition = findMin(arr);
        System.out.printf("Min value: %d. Min position: %d", arr[minPosition], minPosition + 1);
    }

    /**
     * Returns the position of the min element
     * @param arr
     * @return
     */
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    /**
     * Returns the position of the max element
     * @param arr
     * @return
     */
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
