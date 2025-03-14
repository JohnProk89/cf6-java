package gr.aueb.cf.ch9io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOut2App {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/fileinout2app/file6.txt");
        File outFd = new File("C:/tmp/fileinout2app/file6out.txt");
        String line;
        String [] tokens;
        try (Scanner in = new Scanner(inFd); PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8);) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token: tokens) {
                    ps.printf("%s ", token);
                    ps.flush(); // Does not provide a clear difference at the moment...
                }
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
