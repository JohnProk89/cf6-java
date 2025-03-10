package gr.aueb.cf.ch10structuredprogramming;

public class TestClass {

    public static void main(String[] args) {
        int [] testArray = {1, 2};

//        System.out.println(testArray[0]);
//        System.out.println(testArray[0 % 10]);
//        System.out.println(testArray[0 % 10]++);
//        System.out.println(testArray[0]);
//        System.out.println(++testArray[0 % 10]);

//        System.out.println(testArray[1]);
//        System.out.println(testArray[1] > 2);
//        System.out.println(testArray[1]++ > 2);
//        System.out.println(testArray[1] > 2);
//        System.out.println(testArray[1]);

        System.out.println(testArray[1 % 10]);
        System.out.println(testArray[1 % 10]++);
        System.out.println(testArray[1 % 10]);
        System.out.println(testArray[1 % 10]++ > 1);
        System.out.println(testArray[1 % 10]);

        // What is the sequence of the calculations????
    }
}
