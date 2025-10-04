package primer2;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit(); // Uzimanje informacija o ekranu i upravlja resursima
        Dimension screenSize = kit.getScreenSize();

        // Postavljanje velicine prozora na polovinu ekrana
        setSize(screenSize.width / 2, screenSize.height / 2);

        // Postavljanje ikone (putanja je relativna u odnosu na koren projekta)
        Image img = kit.getImage("images/icon.png");
        setIconImage(img);

        // Naslov prozora
        setTitle("Moja Swing aplikacija");

        // Zatvaranje aplikacije pritiskom na X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}