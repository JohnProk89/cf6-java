package gr.aueb.cf.ch7strings;

public class StrCompareApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else {                                 // s1.compareTo(s2) == 0
            System.out.println("s1 == s2");
        }

        System.out.println(s2.compareTo(s1) + ": is the compareTo() return value");
    }
}
