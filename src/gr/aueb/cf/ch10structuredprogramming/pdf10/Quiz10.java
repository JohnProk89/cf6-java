package gr.aueb.cf.ch10structuredprogramming.pdf10;

public class Quiz10 {

    public static void main(String[] args) {
        int[] arr = {22, 44, 0, 2, 4, 4, 5, 6, 7, 1, 9, 10, -4};
        System.out.println(arrayFoo(arr,0,11));
    }

    public static int arrayFoo(int[] array, int low, int high) {
        if (low == high) { // If I have gone through the whole array...
            return high; // Seems good so far...
        } else { // If I have not iterated the whole array yet...
            int newFoo = arrayFoo(array, low + 1, high);
            // When I have reached the end of the array, I start the return statements...
            // First return has high which goes in newFoo
            return (array[low] < array[newFoo])  ? low : newFoo;
        }
    }
}
