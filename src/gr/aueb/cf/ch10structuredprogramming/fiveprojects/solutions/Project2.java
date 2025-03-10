package gr.aueb.cf.ch10structuredprogramming.fiveprojects.solutions;

/**
 * It finds the contiguous sub-array with the largest sum using Kadane's algorithm,
 * and in the following case {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the maximum sum
 * sub-array is [4, -1, 2, 1] with a sum of 6.
 */

public class Project2 {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] maxSubArray = findMaxSubArray(arr);

        System.out.println("Maximum Sub Array:");
        for (int num : maxSubArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] findMaxSubArray(int[] arr) {
        int n = arr.length;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            if (maxEndingHere < 0) {
                tempStart = i + 1; // Updating starting index
                // + 1 for the next loop
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere; // global max update
                start = tempStart; // updating start of max sub array
                end = i; // updating end of max sub array
            }
            System.out.println(i);
            System.out.println("maxEndingHere: " + maxEndingHere);
            System.out.println("tempStart: " + tempStart);
            System.out.println("maxSoFar: " + maxSoFar);
            System.out.println("End: " + end);
            System.out.println("Start: " + start);
        }

        // The result is the sub-array from start to end
        int[] result = new int[end - start + 1]; // Array declaration
        System.out.println(result.length);
        System.arraycopy(arr, start, result, 0, result.length); // Population
        return result;
    }
}
