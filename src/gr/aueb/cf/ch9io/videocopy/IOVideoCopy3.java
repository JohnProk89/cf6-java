package gr.aueb.cf.ch9io.videocopy;

import java.io.*;

/**
 * Copies a video, calculates its size and time to copy
 */
public class IOVideoCopy3 {

    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;
        byte[] buf = new byte[8192];

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/tmp/sampleVideo.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/tmp/sampleVideo-out.mp4"))) {
            long start = System.nanoTime();

            // Copy the file
            while ((b = in.read(buf, 0, buf.length -1)) != -1) {
                out.write(buf, 0, b); // writing the whole buffer, instead of byte per byte
                count += b;
            }

            long end = System.nanoTime();
            long elapsed = end - start; // 0.04 seconds

            System.out.printf("Το αρχείο με μέγεθος %d kBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1_000_000_000.0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
