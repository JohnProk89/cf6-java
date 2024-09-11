package gr.aueb.cf.ch5methodsfloatdouble;

import java.util.Scanner;

public class StarMethodTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int stars = 0;

        do{
            System.out.println("Επιλεξτε απο τα παρακατω");
            System.out.println("1.Οριζόντια");
            System.out.println("2.Κάθετα");
            System.out.println("3.*χ*");
            System.out.println("4.Αυξουσα κατανομη");
            System.out.println("5.Φθινουσα κατανομη");
            System.out.println("6.Εξοδος Προγράμματος");

            choice= in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please insert Number of *");
                    stars = in.nextInt();
                    horizontal(stars);
                    break;

                case 2:
                    System.out.println("Please insert Number of *");
                    stars = in.nextInt();
                    vertical(stars);
                    break;
                case 3:
                    System.out.println("Please insert Number of *");
                    stars = in.nextInt();
                    rows(stars);
                    break;
                case 4:
                    System.out.println("Please insert Number of *");
                    stars = in.nextInt();
                    asc(stars);
                case 5:
                    System.out.println("Please insert Number of *");
                    stars = in.nextInt();
                    dsc(stars);
                default:
                    System.out.println("error in choice");
                    break;

            }

        }while (choice != 6);
        System.out.println("Thank you");
    }
public static void horizontal (int stars){
    for (int i = 1; i <= stars; i++) {
        System.out.println("*");
    }
}
public static void vertical (int stars) {
    for (int i = 1; i <= stars; i++) {
        System.out.print("*");
    }
}
public static void rows (int stars){
    for (int i = 1; i <=stars; i++){
        for (int j =1; j<=stars; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void asc(int stars){
    for (int i = 1; i <= stars; i++){
        for (int j = 1 ; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void dsc(int stars) {
    for (int i = 1; i <= stars; i++) {
        for (int j = i; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
}