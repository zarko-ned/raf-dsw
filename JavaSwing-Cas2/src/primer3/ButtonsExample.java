package primer3;

import javax.swing.*;
import java.awt.*;

public class ButtonsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primer svih dugmadi");
        frame.setLayout(new GridLayout(0, 1));

        // 1. Obicno dugme sa tekstom i ikonom
        ImageIcon icon = new ImageIcon("icon.png"); // Putanja do ikone
        JButton obicnoDugme = new JButton("Obicno dugme", icon);

        // 2. CheckBox
        JCheckBox checkBox = new JCheckBox("Checkbox");

        // 3. Radio dugmad u grupi
        JRadioButton radio1 = new JRadioButton("Opcija 1");
        JRadioButton radio2 = new JRadioButton("Opcija 2");
        ButtonGroup radioGrupa = new ButtonGroup();
        radioGrupa.add(radio1);
        radioGrupa.add(radio2);

        // 4. Toggle dugme
        JToggleButton toggleDugme = new JToggleButton("Toggle");

        // Panel za radio dugmad
        JPanel radioPanel = new JPanel();
        radioPanel.add(new JLabel("Radio button:"));
        radioPanel.add(radio1);
        radioPanel.add(radio2);

        // Dodavanje komponenti u prozor
        frame.add(obicnoDugme);
        frame.add(checkBox);
        frame.add(radioPanel);
        frame.add(toggleDugme);

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}