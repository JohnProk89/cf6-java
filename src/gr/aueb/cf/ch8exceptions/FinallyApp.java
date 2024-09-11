package gr.aueb.cf.ch8exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert a num");
            num = in.nextInt();
        } catch (InputMismatchException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("Inside 1st catch");
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Inside 2nd catch");
            }
        }
    }
}
