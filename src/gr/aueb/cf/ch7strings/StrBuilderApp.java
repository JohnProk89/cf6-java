package gr.aueb.cf.ch7strings;

/**
 * @author johnp
 */
public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        StringBuilder sb = new StringBuilder();

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<= 50_000; i++) {
            concatStr += i;
        }
        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<= 50_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String Elapsed Time: " + stringElapsedTime + " seconds");
        System.out.println("String Builder Elapsed Time: " + sbElapsedTime + " seconds");

        timeStart = System.nanoTime();
        for (int i = 1; i<= 50_000; i++) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        sbElapsedTime = (timeEnd - timeStart) / 1_000_000_000.0;
        System.out.println("String Builder Elapsed Time: " + sbElapsedTime + " seconds");

    }
}
