package gr.aueb.cf.ch4forswitchcharacter;

/**
 * Demo of surrogate pairs.
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int smiley = 0x1F600; //UTF-8 smiley
        System.out.println("Smiley: \uD83D\uDE00"); //surrogate pair

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(smiley));
    }
}
