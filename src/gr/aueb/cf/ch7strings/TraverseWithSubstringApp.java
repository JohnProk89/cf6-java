package gr.aueb.cf.ch7strings;

/**
 * Traverses a string with substring
 */
public class TraverseWithSubstringApp {

    public static void main(String[] args) {
        String s = "Athens";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }

        System.out.println();
        System.out.println(s.substring(0, 0));
    }
}
