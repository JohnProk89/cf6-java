package gr.aueb.cf.ch9io.flush;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:/tmp/Flush/flush-file.txt");
            pw.print("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
