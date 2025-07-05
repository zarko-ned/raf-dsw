package primer6;

import javax.swing.*;
import java.awt.*;

class ToolbarFrame extends JFrame {
    public ToolbarFrame() {
        setTitle("Meni i Toolbar primer");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Dodavanje menija
        setJMenuBar(new FullMenuBar());

        // Dodavanje toolbar-a
        add(new ToolBarPanel(), BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}