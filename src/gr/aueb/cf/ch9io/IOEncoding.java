package gr.aueb.cf.ch9io;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * This programme tries multiple encodings with PrintStream and PrintWriter
 *
 * Greek are supported by UTF-8, Windows-1253, ISO-8859-7
 * Greek are not supported by Windows-1252, ISO-8859-1 (Latin1)
 * @author johnp
 * @since 2024-08-04
 */
public class IOEncoding {

    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("C:/tmp/IOEncoding/testEncode1.txt", "UTF-8");
        PrintWriter pw = new PrintWriter("C:/tmp/IOEncoding/testEncode2.txt", "Windows-1252");

        ps.println("Χαχαχα");
        pw.println("Χαχαχα");

        ps.close();
        pw.close();
    }
}
