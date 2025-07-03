package primer1;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Kreiranje glavnog prozora
        JFrame frame = new JFrame("Moja prva Swing aplikacija");
        frame.setSize(800, 600); // Širina x Visina
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zatvara aplikaciju na X
        frame.setVisible(true); // Prikazuje prozor
    }
}