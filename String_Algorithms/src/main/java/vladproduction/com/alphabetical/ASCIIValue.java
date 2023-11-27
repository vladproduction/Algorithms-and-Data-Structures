package vladproduction.com.alphabetical;

import javax.swing.*;

public class ASCIIValue {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.println(i + " -> " + (char) i);
        }

        char lowercase = 'f';
        int offset = (int) 'a' - (int) 'A';
        char uppercase = (char) ((int) lowercase - offset);
        System.out.println("The uppercase letter is " + uppercase);

        String numberString = JOptionPane.showInputDialog(null,
                "Enter an ASCII code:",
                "ASCII conversion", JOptionPane.QUESTION_MESSAGE);

        int code = (int) numberString.charAt(0);
        System.out.println("The character for ASCII code "
                + code + " is " + (char) code);
    }
}
