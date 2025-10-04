package primer1;

import javax.swing.*;
import java.awt.*;

/**
 * Primer jednostavnog GUI programa koristeći Swing
 * sa modernim izgledom i bojama i kontejnerima.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Kreiranje glavnog prozora (kontejner)
        JFrame frame = new JFrame("Moj prvi moderni GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Kreiranje panela (kontejner)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(240, 248, 255)); // Svetlo plava boja (Alice Blue)

        // 3. Dodavanje komponenti
        JLabel label = new JLabel("Zdravo svete!");
        JButton button = new JButton("Klikni me");
        button.setBackground(new Color(135, 206, 250)); // Svetlo plava boja (Light Sky Blue)
        button.setForeground(Color.WHITE); // Bela boja teksta
        JTextField textField = new JTextField(20);

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // 4. Dodavanje panela u prozor
        frame.add(panel);

        // 5. Prikaz prozora
        frame.setVisible(true);
    }
}