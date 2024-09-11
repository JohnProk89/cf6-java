package gr.aueb.cf.ch8exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(System.in)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();
            System.out.println(ch);
            System.out.println(num);
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception");
            throw e;
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
        }
    }
}
