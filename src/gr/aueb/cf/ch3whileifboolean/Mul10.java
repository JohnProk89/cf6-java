package gr.aueb.cf.ch3whileifboolean;

/**
 * Υπολογίζει το γινόμενο του 1*2*3*...*10 με επαναληπτικό τρόπο
 * @author johnp
 */
public class Mul10 {

    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while(i <=10) {
            mul *= i;
            i++;
        }
    }
}

