package gr.aueb.cf.ch4forswitchcharacter;

import javax.swing.*;
import java.awt.*;

/**
 * Δοκιμές για το Quiz 4 και personal practice
 * @author johnp
 */
public class Quiz4 {

    public static void main(String[] args) {
        System.out.println(Character.toChars(0x130BA));
        // aimed to be U+130BA which is a hieroglyph Egyptian shown a cumming dick
        System.out.println(Character.toChars(0x1F600));
        System.out.println(Character.toString(0x130BA));

        //Obviously, my system does not support Egyptian Hieroglyphs and an installation is needed,
        // such as a Google font...

        // The Unicode code point for the character
        int unicodeCodePoint = 0x130BA;

        // Convert the code point to a string
        String unicodeString = new String(Character.toChars(unicodeCodePoint));

        // Create a JFrame to display the character
        JFrame frame = new JFrame("Unicode Character Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        // Create a JLabel with the Unicode character
        JLabel label = new JLabel("The character for U+130BA is: " + unicodeString);
        label.setFont(new Font("Noto Sans Egyptian Hieroglyphs", Font.PLAIN, 40));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Display the frame
        frame.setVisible(true);
    }
}
