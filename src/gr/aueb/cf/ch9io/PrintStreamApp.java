package gr.aueb.cf.ch9io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Draft code to test random stuff
 * @author johnp
 */
public class PrintStreamApp {

    public static void main(String[] args) {
            try (PrintStream ps = new PrintStream(("C:/tmp/file.txt"))) {
                ps.println("Hello Coding Factory");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
}

