package gr.aueb.cf.ch8exceptions;

import java.util.Arrays;
import java.util.Optional;

public class MethodsErrorsOptionalsWithoutExceptions {

    public static void main(String[] args) {
//        String string = "Athens";
        String string = null;
        String[] stringArray = {"h1", "ho"};
//        String[] stringArray = {};
//        int[] integerArray = {1, 2};
        int[] integerArray = {};
        Optional<String> opt = getStringCopy(string);
        Optional<String> optSa = getStringStartsWith(stringArray, null);
        Optional<int[]> optIa = getCopy(integerArray);

        System.out.println(Optional.empty()); // Prints "Optional.empty"
        System.out.println(opt);              // Prints "Optional[value]"
        System.out.println(Optional.ofNullable(null));
        opt.ifPresent(System.out::println); // Prints "Athens" or nothing if null
        optSa.ifPresent(System.out::println); // Prints "h" or nothing if null
        optIa.ifPresent(System.out::println); // Prints array's pointer value
//        System.out.println(Optional.of(null)); // throws NullPointerException
    }

    /**
     * Returns a string that starts with a specific prefix
     * @param arr the input array of strings
     * @param str the input prefix
     * @return the string in the array that matches the input prefix, null otherwise
     */
    public static Optional<String> getStringStartsWith(String[] arr, String str) {
        if (arr == null || str == null) return Optional.empty();

        Optional<String> token = Optional.empty();

        for (String s : arr) {
            if (s.startsWith(str)) {
                token = Optional.of(str);
                break;
            }
        }
        return token;
    }

    /**
     * Returns a copy of a given array of integers. Instead of null, it returns Optional. Since the array is mutable, we return not just a reference, but a copy of the array
     * @param arr the source array
     * @return an Optional, null or empty
     */
    public static Optional<int[]> getCopy(int[] arr) {
        if (arr == null) return Optional.empty();
        return Optional.of(Arrays.copyOf(arr, arr.length));
    }

    /**
     * It echoes the given string back to the caller. Since strings are immutable we can just get the reference back
     * @param s the source string
     * @return the source string as Optional object
     */
    public static Optional<String> getStringCopy(String s) {
        return Optional.ofNullable(s); // Optional.of(null) -> NullPointerException
    }
}
