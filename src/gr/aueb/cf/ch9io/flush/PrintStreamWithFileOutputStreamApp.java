package gr.aueb.cf.ch9io.flush;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithFileOutputStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/FluSh/file1.txt")
            , true, StandardCharsets.UTF_8 )) {
            ps.println("Hello");
            ps.println("Χαχα");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
