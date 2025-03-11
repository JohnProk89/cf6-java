package gr.aueb.cf.ch7strings;

/**
 * String copy
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = copyStr(s1); // Not indicated as redundant by IDE
        String s3 = s1;         // Indicated as redundant by IDE

        System.out.println(s2);
        s2 = "Paris";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static String copyStr(String s) {
        return s;
    }
}
