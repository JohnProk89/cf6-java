package gr.aueb.cf.ch2integer;

/**
 * Επιδεικνύει τις μετατροπές μεταξύ διαφορετικών τύπων δεδομένων.
 */
public class TypecastApp {
    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L;
        int myResultInt = 0;
        long myResultLong = 0L;

        myLong = myInt;       // auto-widening auto typecast
        myInt = (int) myLong; // typecast

        myResultInt = myInt + (int)myLong;
        myResultLong = myInt * myLong;
        myResultLong = myInt;
    }
}
