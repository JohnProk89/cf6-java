package gr.aueb.cf.ch2integer;

import java.util.Scanner;

/**
 * Ζητείται από τον χρήστη να εισάγει μέρες, ώρες, λεπτά, δευτερόλεπτα, το μετατρέπει σε δευτερόλεπτα και το εκτυπώνει
 */
public class MakeSecondsApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών

        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        //Εισαγωγή δεδομένων και υπολογισμοί
        System.out.println("Please insert days, hours, minutes, seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();
        totalSeconds = SECS_PER_DAY * days + SECS_PER_HOUR * hours + SECS_PER_DAY * seconds;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("The total seconds is" + totalSeconds);

    }
}
