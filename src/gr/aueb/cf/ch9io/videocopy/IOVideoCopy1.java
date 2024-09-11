package gr.aueb.cf.ch9io.videocopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copies a video, calculates its size and time to copy
 */
public class IOVideoCopy1 {

    public static void main(String[] args) throws java.io.IOException{
        int b, count = 0;

        try (FileInputStream in = new FileInputStream("C:/tmp/sampleVideo.mp4");
             FileOutputStream out = new FileOutputStream("C:/tmp/sampleVideo-out.mp4")) {

            long start = System.nanoTime();
            // Copy file
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            long end = System.nanoTime();
            long elapsed = end - start; //  80.85 seconds

            System.out.printf("Το αρχείο με μέγεθος %d kBytes (%d bytes) αντιγράφηκε", count/ 1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1_000_000_000.0);
        }
    }
}
