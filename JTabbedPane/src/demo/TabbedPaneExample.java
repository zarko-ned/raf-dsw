package demo;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample extends JFrame {
    public TabbedPaneExample() {
        setTitle("Primer Tabbed Pane-a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Prvi tab
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Dobrodosli na prvi tab!"));
        tabbedPane.addTab("Pocetak", null, panel1, "Osnovne informacije");

        // Drugi tab
        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Klikni me"));
        tabbedPane.addTab("Opcije", panel2);

        // Treci tab
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(new JTextArea(), BorderLayout.CENTER);
        tabbedPane.addTab("Notepad", panel3);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TabbedPaneExample::new);
    }
}