package gr.aueb.cf.ch2integer;

/**
 *  Template for programming.
 *  Πολλαπλασιάζει 2 ακεραίους και εκτυπώνει το αποτέλεσμα στην κονσόλα.
 */
public class Output2App {
    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 500;
        int totalPrice = 0;

        // Εντολές
        totalPrice = price * quantity;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("Price: %3d, Quantity: %d, Total Price: %,d\n" , price, quantity, totalPrice);
    }
}
