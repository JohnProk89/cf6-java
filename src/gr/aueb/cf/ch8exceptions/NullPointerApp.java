package gr.aueb.cf.ch8exceptions;

public class NullPointerApp {

    public static void main(String[] args) {
        String s = null;

        // State testing
        if (s == null) {
            System.out.println("string is null");
            return;
        }

        if (s.equals("Athens")) {
            System.out.println("EQUALS");
        }
    }
}
