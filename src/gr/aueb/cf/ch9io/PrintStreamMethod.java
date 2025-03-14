package gr.aueb.cf.ch9io;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/file6out.txt")) {
            printMessage(ps, "Hello CF"); // Prints to file
            printMessage(System.out, "Hello CF"); // Prints to stdout
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic print method
     * @param ps     the PrintStream
     * @param message   the message to print
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
