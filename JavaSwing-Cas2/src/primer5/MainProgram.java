package primer5;

import javax.swing.*;

/**
 * Glavna klasa programa koja kreira i prikazuje glavni prozor aplikacije.
 */
public class MainProgram {
    public static void main(String[] args) {
        // 1. Kreiranje glavnog prozora (kontejner)
        JFrame frame = new FullMenuFrame();

        // 2. Postavljanje vidljivosti prozora
        frame.setVisible(true);

        // 3. Podesavanje lokacije prozora na sredinu ekrana
        frame.setLocationRelativeTo(null);

        // 4. Podesavanje podrazumevanog zatvaranja prozora
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
