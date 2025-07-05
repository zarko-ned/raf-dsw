package primer6;

import javax.swing.*;

class FullMenuBar extends JMenuBar {
    public FullMenuBar() {
        JMenu fileMenu = new JMenu("File");

        ImageIcon icon1 = new ImageIcon("open.png");
        ImageIcon icon2 = new ImageIcon("save.png");
        ImageIcon icon3 = new ImageIcon("close.png");

        JMenuItem item1 = new JMenuItem("Open", icon1);
        JMenuItem item2 = new JMenuItem("Save", icon2);
        JMenuItem item3 = new JMenuItem("Close", icon3);


        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Enable sound");
        JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Enable notifications");

        JMenu subMenu = new JMenu("Advanced");
        subMenu.add(new JMenuItem("Settings"));
        subMenu.add(new JMenuItem("Logs"));

        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);
        fileMenu.addSeparator();
        fileMenu.add(radio1);
        fileMenu.add(radio2);
        fileMenu.addSeparator();
        fileMenu.add(check1);
        fileMenu.add(check2);
        fileMenu.addSeparator();
        fileMenu.add(subMenu);

        JMenu anotherMenu = new JMenu("Another Menu");
        anotherMenu.add(new JMenuItem("Say Hello"));

        add(fileMenu);
        add(anotherMenu);
    }
}