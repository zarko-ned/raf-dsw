package mvc;

import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;

class View  {

    private TextField myTextField;
    private Button button;
    private Model model;

    // Konstruktor View klase - prima Model kao parametar da bi uzeo pocetnu vrednost
    public View(Model model) {

        this.model = model;

        // Frame je u konstruktoru, jer ne treba biti vidljiv u celoj aplikaciji
        Frame frame = new Frame("simple MVC");
        frame.add("North", new Label("counter"));

        myTextField = new TextField();
        frame.add("Center", myTextField);

        // Panel je u konstruktoru, jer ne treba biti vidljiv u celoj aplikaciji
        Panel panel = new Panel();
        button = new Button("PressMe");
        panel.add(button);
        frame.add("South", panel);

        // Dodaje WindowListener za zatvaranje prozora
        frame.addWindowListener(new CloseListener());
        frame.setSize(300, 200);
        frame.setLocation(100, 100);
        frame.setVisible(true);

    }

    // Metoda koja se poziva iz Modela kada se promeni vrednost
    public void update() {
        // Azurira tekstualno polje sa novom vrednoscu iz modela
        myTextField.setText(""+model.getValue());
    }

    // Dodaje kontroler kao ActionListener za dugme
    public void addController(ActionListener controller) {
        System.out.println("View      : adding controller");
        button.addActionListener(controller); // Potreban je instance kontrolera
        // pre nego što se moze dodati kao listener
    }

    // Metoda za inicijalizaciju tekstualnog polja
    public void setValue(int v) {
        myTextField.setText("" + v);
    }

    // Unutrasnja klasa za rukovanje zatvaranjem prozora
    public static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0); // Zatvara aplikaciju
        }
    }

}