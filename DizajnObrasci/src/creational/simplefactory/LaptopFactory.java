package creational.simplefactory;

public class LaptopFactory {

    public LaptopFactory() {
    }

    public Laptop createLaptop(String laptopType) {
        if (laptopType.toUpperCase().equals("GAMINGLAPTOP"))
            return new GamingLaptop();

        else if (laptopType.toUpperCase().equals("NORMALLAPTOP"))
            return new NormalLaptop();

        return null;
    }
}