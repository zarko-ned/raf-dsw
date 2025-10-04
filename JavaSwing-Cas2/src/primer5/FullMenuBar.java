package primer5;

import javax.swing.*;

/**
 * Klasa koja predstavlja traku menija sa različitim tipovima menija i stavki.
 */
class FullMenuBar extends JMenuBar {
    public FullMenuBar() {
        // JMenu 1: "A Menu"
        JMenu aMenu = new JMenu("Menu");

        // Ikonica (pretpostavlja se da postoji u root folderu projekta)
        ImageIcon icon = new ImageIcon("icon2.png");

        // JMenuItem sa ikonicom
        JMenuItem item1 = new JMenuItem("Dinosaurus", icon);

        JMenuItem item2 = new JMenuItem("Save");

        JMenuItem item3 = new JMenuItem("Close");



        // Radio dugmad u meniju
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Opcija 1");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Opcija 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        radio1.setSelected(true);

        // Checkbox dugmad u meniju
        JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Dozvoli automatsko čuvanje");
        JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Dozvoli notifikacije");

        // Podmeni
        JMenu subMenu = new JMenu("Podmenu");
        JMenuItem subItem1 = new JMenuItem("Stavka 1");
        JMenuItem subItem2 = new JMenuItem("Stavka 2");

        subMenu.add(subItem1);
        subMenu.add(subItem2);

        // Dodavanje u "A Menu"
        aMenu.add(item1);
        aMenu.add(item2);
        aMenu.add(item3);
        aMenu.addSeparator();
        aMenu.add(radio1);
        aMenu.add(radio2);
        aMenu.addSeparator();
        aMenu.add(check1);
        aMenu.add(check2);
        aMenu.addSeparator();
        aMenu.add(subMenu);

        // JMenu 2: "Another Menu"
        JMenu anotherMenu = new JMenu("Jos jedan Menu");
        JMenuItem helloItem = new JMenuItem("Say Hello");

        anotherMenu.add(helloItem);

        // Dodavanje menija u meni bar
        add(aMenu);
        add(anotherMenu);
    }
}