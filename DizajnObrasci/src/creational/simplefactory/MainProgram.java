package creational.simplefactory;

public class MainProgram {
    public static void main(String[] args) {

        LaptopFactory laptopFactory = new LaptopFactory();
        // Dobavlja objekat tipa src.GamingLaptop i pokrece testove
        Laptop myLaptop = laptopFactory.createLaptop("NormalLaptop");

        myLaptop.runTests();
    }
}