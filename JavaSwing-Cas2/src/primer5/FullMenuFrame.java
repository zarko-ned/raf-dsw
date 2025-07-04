package primer5;

import javax.swing.*;

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