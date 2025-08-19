package primer9;

import javax.swing.*;
import java.awt.*;

public class GridLayoutFlexExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Fleksibilni Primer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // GridLayout sa 0 redova (automatski) i 3 kolone
        frame.setLayout(new GridLayout(0, 3, 10, 10));

        // Dodajemo 7 dugmadi - bice organizovana u 3 kolone
        for (int i = 1; i <= 7; i++) {
            frame.add(new JButton("Dugme " + i));
        }

        frame.setVisible(true);
    }
}