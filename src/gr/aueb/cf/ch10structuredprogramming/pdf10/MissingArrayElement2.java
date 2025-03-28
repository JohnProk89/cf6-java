package gr.aueb.cf.ch10structuredprogramming.pdf10;

public class MissingArrayElement2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getMissingElement(arr));
    }

    public static int getMissingElement(int [] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n;

        n = arr.length + 1;
        expectedSum = n * (n + 1) / 2;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
