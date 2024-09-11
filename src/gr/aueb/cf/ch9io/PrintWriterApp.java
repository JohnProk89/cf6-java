package gr.aueb.cf.ch9io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/tmp/fw.txt");) {
            pw.print("Hello World1");
            pw.println("Hello World2");
            pw.print("Hello World3");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
