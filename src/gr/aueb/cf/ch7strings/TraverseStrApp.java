package gr.aueb.cf.ch7strings;

/**
 * Demo of charAt()
 */
public class TraverseStrApp {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
