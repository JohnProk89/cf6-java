package gr.aueb.cf.ch7strings;

/**
 * Prints the first CLI argument
 */
public class ArgsApp {

    public static void main(String[] args) {
        if (args.length !=1) return;
        System.out.println(args[0]);
    }
}
