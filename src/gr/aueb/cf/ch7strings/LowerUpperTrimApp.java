package gr.aueb.cf.ch7strings;

public class LowerUpperTrimApp {

    /**
     * Convert to lower, uppercase, trimmed
     * @param args
     */
    public static void main(String[] args) {
        String lexeme = "   Athens University of Economics and  Business   ";
        String lowercase;
        String uppercase;
        String trimmed;

        lowercase = lexeme.toLowerCase();
        uppercase = lexeme.toUpperCase();
        trimmed = lexeme.trim();

        System.out.printf("Lexeme: %s, Lowercase: %s \n", lexeme, lowercase);
        System.out.printf("Lexeme: %s, Uppercase: %s \n", lexeme, uppercase);
        System.out.printf("Lexeme: %s, Trimmed: %s \n", lexeme, trimmed);
    }
}
