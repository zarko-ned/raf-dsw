package primer6;

import javax.swing.*;

class ToolBarPanel extends JToolBar {
    public ToolBarPanel() {
        setFloatable(true); // omogucava pomeranje toolbar-a

        // Ikone
        ImageIcon saveIcon = new ImageIcon("save.png");
        ImageIcon exitIcon = new ImageIcon("close.png");

        // Dugmad

        JButton saveBtn = new JButton(saveIcon);
        saveBtn.setToolTipText("Save");

        JButton exitBtn = new JButton(exitIcon);
        exitBtn.setToolTipText("Exit");

        // Dodavanje dogadjaja
        saveBtn.addActionListener(e -> JOptionPane.showMessageDialog(null, "Save clicked"));
        exitBtn.addActionListener(e -> System.exit(0));

        // Dodavanje dugmadi u toolbar
        add(saveBtn);
        addSeparator();
        add(exitBtn);
    }
}
