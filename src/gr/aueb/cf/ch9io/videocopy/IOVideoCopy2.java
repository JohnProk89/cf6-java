package gr.aueb.cf.ch9io.videocopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copies a video, calculates its size and time to copy
 */
public class IOVideoCopy2 {

    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;
        byte[] buf = new byte[8192]; // either 4096 or 8192 is fine, although my System uses 4096 I guess...

        try (FileInputStream in = new FileInputStream("C:/tmp/sampleVideo.mp4");
             FileOutputStream out = new FileOutputStream("C:/tmp/sampleVideo-out.mp4")) {

            long start = System.nanoTime();

            // Copy the file
            while ((b = in.read(buf)) != -1) { // .read() reads as far as the length of the buffer buf
                out.write(buf); // writing the whole buffer, instead of byte per byte
                count += b;
            }

            long end = System.nanoTime();
            long elapsed = end - start; // 0.04 seconds

            System.out.printf("Το αρχείο με μέγεθος %d kBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1_000_000_000.0);
        }
    }
}
