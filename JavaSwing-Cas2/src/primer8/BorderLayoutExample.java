package primer8;

import javax.swing.*;
import java.awt.*;

/**
 * Primer koji demonstrira korišćenje BorderLayout menadžera rasporeda.
 * Komponente su raspoređene u pet regiona: NORTH, SOUTH, EAST,
 * WEST i CENTER.
 */
public class BorderLayoutExample {
    public static void main(String[] args) {
        // Kreiranje prozora (JFrame)
        JFrame frame = new JFrame("BorderLayout Primer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Postavljanje BorderLayout (podrazumevano za JFrame)
        frame.setLayout(new BorderLayout(10, 10)); // horizontalni i vertikalni razmak

        // Dodavanje komponenti u razlicite regione
        frame.add(new JButton("Sever (NORTH)"), BorderLayout.NORTH);
        frame.add(new JButton("Jug (SOUTH)"), BorderLayout.SOUTH);
        frame.add(new JButton("Istok (EAST)"), BorderLayout.EAST);
        frame.add(new JButton("Zapad (WEST)"), BorderLayout.WEST);
        frame.add(new JButton("Centar (CENTER)"), BorderLayout.CENTER);

        // Prikaz prozora
        frame.setVisible(true);
    }
}