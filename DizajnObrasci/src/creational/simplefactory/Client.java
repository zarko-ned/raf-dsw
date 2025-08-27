package creational.simplefactory;

public class Client {
    public static void main(String[] args) {

        LaptopFactory laptopFactory = new LaptopFactory();
        // Dobavlja objekat tipa src.GamingLaptop i pokrece testove
        Laptop myLaptop = laptopFactory.createLaptop("NormalLaptop");

        myLaptop.runTests();
    }
}