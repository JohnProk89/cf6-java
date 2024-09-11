package gr.aueb.cf.ch5methodsfloatdouble;

import java.io.IOException;

/**
 * Quiz 5 testing and personal practice
 * @author johnp
 */
public class Quiz5 {

    public static void main(String[] args) throws IOException {
        char characterCharBang = '!';
        char characterCharHash = '#';
        int characterIntBang = '!';
        int characterIntHash = '#';
        System.out.println("char #: " + characterCharHash);
        System.out.println("char !: " + characterCharBang);
        System.out.println("int !: " + characterIntBang);
        System.out.println("int #: " + characterIntHash);
        System.out.println("sum ! + 1: " + characterCharBang+1);
        System.out.println(characterCharBang+1);
        System.out.println("sum int ! + 1: " + characterIntBang+1);
        System.out.println(characterIntBang+1);
        System.out.println("sum ! + #: " + characterCharBang+characterCharHash);
        System.out.println(characterCharBang);

        System.out.println(System.in.read());
        System.out.println((char)System.in.read());

    }
  }
