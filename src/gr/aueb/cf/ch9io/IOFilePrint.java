package gr.aueb.cf.ch9io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/IOFilePrint/IOSimpleTest1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/IOFilePrint/IOSimpleTest2.txt"))
        {
            ps.println("Hello World from PrintStream");
            pw.println("Hello World from PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε");
        }
    }

}
