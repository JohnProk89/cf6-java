package gr.aueb.cf.ch7strings;

/**
 * Quiz 7 draft
 * @author johnp
 */
public class Quiz7 {
    public static void main(String[] args) {
        String s1 = "Bob";
        String s2 = "Alice";
        s2 = s1 + s2;
        System.out.println(s2);

        char c = 'o';
        char c2 = '0';
        boolean isC = Character.isAlphabetic(c2);
        boolean isC2 = Character.isLetter(c2);
        System.out.println(isC);
        System.out.println(isC2);
    }
}
