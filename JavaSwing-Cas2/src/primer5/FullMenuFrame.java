package primer5;

import javax.swing.*;

/**
 * Klasa koja predstavlja glavni prozor aplikacije sa kompletnim menijem.
 */
class FullMenuFrame extends JFrame {
    public FullMenuFrame() {
        setTitle("Kompletan meni primer");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setJMenuBar(new FullMenuBar());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}