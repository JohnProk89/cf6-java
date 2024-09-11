package gr.aueb.cf.ch7strings;

public class HelloStringApp {

    public static void main(String[] args) {

        String s = "Alice";                     // length == 5, δηλαδή από 0 - 4
        String bob = new String("Bob"); // προβληματική δήλωση σε πολλές περιπτώσεις

        System.out.println("Length of \"Alice\": " + s.length());
        System.out.println("Length of \"Bob\": " + bob.length());
    }
}
