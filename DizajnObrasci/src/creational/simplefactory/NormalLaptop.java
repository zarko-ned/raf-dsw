package creational.simplefactory;

public class NormalLaptop implements Laptop {

    public NormalLaptop() {
    }

    @Override
    public void runTests() {
        System.out.println("Running tests on a NormalLaptop...");
    }
}