package gr.aueb.cf.ch9io.flush;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/flush/fos.txt"), true)) {
            ps.println("Helloo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
