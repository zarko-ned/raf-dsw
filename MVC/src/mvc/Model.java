package mvc;

public class Model  {

    private int counter; // Primitivni tip, automatski se inicijalizuje na 0

    public Model() {

        System.out.println("Model()");

    }

    public void setValue(int value) {

        this.counter = value;
        System.out.println("Model init: counter = " + counter);

    }

    public void incrementValue() {

        ++counter;
        System.out.println("Model     : counter = " + counter);

    }

    public int getValue() {

        return counter;
    }

}
