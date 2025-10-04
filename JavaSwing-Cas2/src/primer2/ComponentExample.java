package primer2;

import javax.swing.*;
import java.awt.*;

/**
 * Primer koji demonstrira kreiranje i prilagodjavanje Swing komponente (JButton)
 * unutar JFrame prozora.
 */
public class ComponentExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primer komponente");
        frame.setLayout(null); // Iskljucujemo LayoutManager za rucno pozicioniranje

        // Kreiranje dugmeta sa prilagodjenim svojstvima
        JButton button = new JButton("Klikni me");
        button.setName("mainButton");
        button.setBounds(50, 50, 200, 60);
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Dodavanje dugmeta u prozor
        frame.add(button);

        // Podesavanje prozora
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}