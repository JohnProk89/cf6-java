package gr.aueb.cf.ch3whileifboolean;

import java.util.Scanner;

/**
 * Το πρόγραμμα δέχεται από τον χρήστη ζεύγη τιμών, που αναπαριστούν πλήθος μαθημάτων και σύνολο βαθμών μαθημάτων.
 * Το κάνει συνέχεια αυτό και στο τέλος υπολογίζει το μέσο όρων όλων των μαθημάτων
 * Επιθυμιτοί έλεγχοι, μέσος όρος μεταξύ 0 - 10, πλήθος μαθημάτων διάφορο το μηδενός, όχι διαίρεση με μηδέν...
 */
public class GradesAppLooped {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalGrades = 0;
        int gradesCount = 0;
        int average = 0;

        while (true) {
            System.out.println("Please insert total grades and grades count, if you want to stop, type 0 grades count");
            totalGrades =  scanner.nextInt();
            gradesCount = scanner.nextInt();

            if (gradesCount == 0 ) {
                System.out.println("Grades count cannot be zero");
                System.exit(1);
            }

            average = totalGrades / gradesCount;

            if (average < 0 || average > 10) {
                System.out.println("Error. The average is not valid");
                System.exit(1);
            }

            if (average >= 9) {
                System.out.println("Excellent");
            } else if (average >= 7) {
                System.out.println("Very Good");
            } else if (average >= 5) {
                System.out.println("Good");
            } else {
                System.out.println("Fail");
            }
        }

    }
}
