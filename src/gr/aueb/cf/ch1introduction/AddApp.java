package gr.aueb.cf.ch1introduction;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το
 * αποτέλεσμα στην οθόνη (κονσόλα)
 * @author johnp
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}