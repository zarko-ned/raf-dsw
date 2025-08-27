package mvc;

class Controller implements java.awt.event.ActionListener {

    private Model model;
    private View view;


    public Controller(Model m, View view) {

        this.model = m;
        this.view = view;

    }

    // Poziva se kada je dugme pritisnuto
    public void actionPerformed(java.awt.event.ActionEvent e) {

        model.incrementValue();
        view.update();

    }

    public void initModel(int x) {

        model.setValue(x);
        view.update();
    }

}
