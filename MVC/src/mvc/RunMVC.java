package mvc;

public class RunMVC {

    private int startValue = 10; // Inicijalna vrednost koja se presledjuje modeli


    public RunMVC() {

        // Kreiremo moodel i view
        Model myModel = new Model();
        View myView = new View(myModel);


        // Kreiramo kontroler i dodamo mu model i view
        Controller myController = new Controller(myModel, myView);
        myController.initModel(startValue);

        // Veiw-u dodamo kontroler
        myView.addController(myController);


    }

}
