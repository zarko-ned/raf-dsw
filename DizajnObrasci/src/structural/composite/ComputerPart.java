package structural.composite;

// Computer part predstavlja component node
public abstract class ComputerPart {
    private String name;
    private double price;

    public ComputerPart(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public abstract String getSpecifications();
}
