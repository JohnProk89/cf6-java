package gr.aueb.cf.ch2integer;

/**
 * Ελέγχει την υπερχείλιση στην περίπτωση που συμβεί.
 */
public class OverflowApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
