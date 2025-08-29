package demo;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * Primer korišćenja JTree komponente za prikaz hijerarhijskih podataka
 * Demonstrira osnovne koncepte rada sa stabilima u Swing-u
 */
public class TreeExample extends JFrame {

    private JTree stablo;
    private JLabel izabraniElementLabel;

    public TreeExample() {
        // Kreiranje korenskog čvora stabla
        DefaultMutableTreeNode koren = new DefaultMutableTreeNode("Kategorije hrane");

        // Kreiranje podčvorova za povrće
        DefaultMutableTreeNode povrceNode = new DefaultMutableTreeNode("Povrće");
        povrceNode.add(new DefaultMutableTreeNode("Paprika"));
        povrceNode.add(new DefaultMutableTreeNode("Šargarepa"));
        povrceNode.add(new DefaultMutableTreeNode("Paradajz"));
        povrceNode.add(new DefaultMutableTreeNode("Krompir"));
        povrceNode.add(new DefaultMutableTreeNode("Luk"));

        // Kreiranje podčvorova za voće
        DefaultMutableTreeNode voceNode = new DefaultMutableTreeNode("Voće");
        voceNode.add(new DefaultMutableTreeNode("Banana"));
        voceNode.add(new DefaultMutableTreeNode("Mango"));
        voceNode.add(new DefaultMutableTreeNode("Jabuka"));
        voceNode.add(new DefaultMutableTreeNode("Grožđe"));
        voceNode.add(new DefaultMutableTreeNode("Orange"));

        // Kreiranje podčvorova za mlecne proizvode
        DefaultMutableTreeNode mlecniProizvodiNode = new DefaultMutableTreeNode("Mlečni proizvodi");
        mlecniProizvodiNode.add(new DefaultMutableTreeNode("Mleko"));
        mlecniProizvodiNode.add(new DefaultMutableTreeNode("Sir"));
        mlecniProizvodiNode.add(new DefaultMutableTreeNode("Jogurt"));
        mlecniProizvodiNode.add(new DefaultMutableTreeNode("Pavlaka"));

        // Dodavanje podčvorova korenskom čvoru
        koren.add(povrceNode);
        koren.add(voceNode);
        koren.add(mlecniProizvodiNode);

        // Kreiranje JTree komponente sa korenskim čvorom
        stablo = new JTree(koren);

        // Podešavanje ikonica za čvorove
        try {
            ImageIcon ikonicaLista = new ImageIcon("leaf.png");
            DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
            renderer.setLeafIcon(ikonicaLista); // Postavljanje ikone za listove
            stablo.setCellRenderer(renderer);
        } catch (Exception e) {
            System.out.println("Ikona nije pronađena, koristiće se podrazumevana.");
        }

        // Podešavanje izgleda stabla
        stablo.setShowsRootHandles(true);    // Prikaz ručki za proširenje
        stablo.setRootVisible(true);         // Prikaz korenskog čvora

        // Dodavanje stabla u scroll pane
        add(new JScrollPane(stablo));

        // Kreiranje labela za prikaz izabranog elementa
        izabraniElementLabel = new JLabel("Izaberite stavku iz stabla");
        izabraniElementLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(izabraniElementLabel, BorderLayout.SOUTH);

        // Dodavanje osluškivača za promenu selekcije u stabilu
        stablo.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent dogadjaj) {
                DefaultMutableTreeNode izabraniCvor = (DefaultMutableTreeNode) stablo.getLastSelectedPathComponent();

                if (izabraniCvor != null) {
                    Object vrednostCvora = izabraniCvor.getUserObject();
                    izabraniElementLabel.setText("Izabrano: " + vrednostCvora.toString());

                    // Provera da li je izabrani čvor list
                    if (izabraniCvor.isLeaf()) {
                        izabraniElementLabel.setText(izabraniElementLabel.getText() + " (list)");
                    } else {
                        izabraniElementLabel.setText(izabraniElementLabel.getText() + " (grupa)");
                    }
                }
            }
        });

        // Podešavanje prozora
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Primer JTree komponente - Hijerarhija namirnica");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null); // Centriranje prozora
    }

    public static void main(String[] args) {
        // Pokretanje Swing aplikacije na ispravan način
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TreeExample().setVisible(true);
            }
        });
    }
}