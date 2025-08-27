package creational.simplefactory;

public class GamingLaptop implements Laptop {

    public GamingLaptop() {
    }

    @Override
    public void runTests() {
        System.out.println("Running tests on a GamingLaptop...");
    }
}