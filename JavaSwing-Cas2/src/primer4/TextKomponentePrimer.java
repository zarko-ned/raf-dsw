package primer4;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.MaskFormatter;

public class TextKomponentePrimer {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Text komponente");
        frame.setLayout(new GridLayout(0, 1, 5, 5));

        // 1. JLabel
        JLabel label = new JLabel("Ovo je labela sa ikonom",
                new ImageIcon("icon.png"), SwingConstants.LEFT);

        // 2. JTextField
        JTextField textField = new JTextField("Jednolinijski tekst", 20);

        // 3. JFormattedTextField (za datum)
        MaskFormatter dateFormat = new MaskFormatter("##-##-####");
        dateFormat.setPlaceholderCharacter('_');
        JFormattedTextField formattedField = new JFormattedTextField(dateFormat);
        formattedField.setValue("01-01-2026");

        // 4. JTextArea
        JTextArea textArea = new JTextArea("Višelinijski tekst...\nDruga linija");
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 5. JTextPane
        JTextPane textPane = new JTextPane();
        textPane.setText("Formatirani tekst (može bold, italic...)");

        // Dodavanje komponenti
        frame.add(label);
        frame.add(new JLabel("Običan JTextField:"));
        frame.add(textField);
        frame.add(new JLabel("Formatirani JFormattedTextField (datum):"));
        frame.add(formattedField);
        frame.add(new JLabel("JTextArea sa scroll barom:"));
        frame.add(scrollPane);
        frame.add(new JLabel("JTextPane za formatirani tekst:"));
        frame.add(textPane);

        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}