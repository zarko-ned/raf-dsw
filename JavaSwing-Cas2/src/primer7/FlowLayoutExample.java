package primer7;

import javax.swing.*;
import java.awt.*;

/**
 * Primer koji demonstrira korišćenje FlowLayout menadžera rasporeda.
 * Dugmad su poravnata ulevo sa horizontalnim i vertikalnim razmakom
 */

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Kreiranje prozora (JFrame)
        JFrame frame = new JFrame("FlowLayout Primer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Postavljanje FlowLayout sa levim poravnanjem
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Dodavanje dugmadi u prozor
        frame.add(new JButton("Dugme 1"));
        frame.add(new JButton("Dugme 2"));
        frame.add(new JButton("Dugme 3"));
        frame.add(new JButton("Dugme 4"));
        frame.add(new JButton("Dugme 5"));

        // Prikaz prozora
        frame.setVisible(true);
    }
}
