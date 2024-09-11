package gr.aueb.cf.ch9io;

import java.io.*;

public class ImageBufferedCopyApp {

    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/tmp/sample.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/tmp/kefali-out.jpg"))) {

            int b;
            int count = 0;
            long start;
            long end;
            double elapsedTime = 0.0;
            byte[] buf = new byte[4096];

            start = System.currentTimeMillis();
            while((b = bis.read(buf, 0, buf.length)) != -1) {
                bos.write(buf, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("Successful Copy, Το αρχείο με μέγεθος %d KB (%d bytes) αντιγράφηκε επιτυχώς", count/1024, count);
            System.out.println("Elapsed time: " + elapsedTime + " seconds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
