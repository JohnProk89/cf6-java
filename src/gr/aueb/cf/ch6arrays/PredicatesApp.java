package gr.aueb.cf.ch6arrays;

/**
 * Predicates are boolean methods
 */
public class PredicatesApp {

    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        System.out.println("There is at least one positive " + hasOnePositive(testArray));
        System.out.println("All elements are positive " + areAllPositive(testArray));
        System.out.println(areLTNPositive(testArray,3));
        System.out.println(areGTNEven(testArray,3));
        System.out.println(areGTNOdd(testArray,3));
        System.out.println(areSameEnding(testArray,2));
        System.out.println(areSameGroupOfTen(testArray,3));
    }

    /**
     * Checks if there is at least one positive in the input array
     * @param arr the input array
     * @return true, if there is at least one positive, false otherwise
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for(int item : arr) {
            if (item > 0 ) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    /**
     * Checks if all are positive in given array
     * @param arr given array
     * @return true or false
     */
    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    /**
     * Checks if the given array has fewer positives than the given threshold
     * @param arr given array
     * @param threshold given threshold
     * @return true/false
     */
    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    /**
     * Checks if given array has more even numbers than the threshold given
     * @param arr given array
     * @param threshold given threshold
     * @return false/true
     */
    public static boolean areGTNEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    /**
     * Checks if given array has more odd numbers than the threshold given
     * @param arr given array
     * @param threshold given threshold
     * @return false/true
     */
    public static boolean areGTNOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    /**
     * Takes as parameter an int array and checks if there are elements that have the same ending(number).
     * If they are equal or greater than a threshold, it returns true
     * @param arr given array
     * @param threshold given threshold
     * @return false/true
     */
    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    /**
     * Checks an int array if it has elements in the same group of tens. It can handle values between 0-99
     * Compares the number of elements of each group with a threshold
     * @param arr given array
     * @param threshold given threshold
     * @return false/true
     */
    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
