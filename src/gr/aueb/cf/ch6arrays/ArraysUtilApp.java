package gr.aueb.cf.ch6arrays;

import java.util.Arrays;

public class ArraysUtilApp {

    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3, 12, 1};
        int[] arrayCopy;
        int[] arraySecondCopy;


        // Array Sort
        Arrays.sort(arr);
        traverse(arr);
        System.out.println();

        arrayCopy = Arrays.copyOf(arr, arr.length); // Deep copy?
        traverse(arrayCopy);
        System.out.println();

        arraySecondCopy = Arrays.copyOfRange(arr, 1, arr.length); // Deep copy?
        traverse(arraySecondCopy);
        System.out.println();

//        arr[0] = 0;
//        traverse(arr);
//        System.out.println();
//        traverse(arrayCopy);
//        System.out.println();
//        traverse(arraySecondCopy);

        System.arraycopy(arr, 0, arrayCopy, 0, arr.length);
        arr[0] = 10;
        traverse(arr);
        System.out.println();
        traverse(arrayCopy);


    }

    public static void traverse(int[] arr) {
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
}
