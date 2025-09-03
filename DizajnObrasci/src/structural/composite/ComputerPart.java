package structural.composite;

// Computer part predstavlja component node
public abstract class ComputerPart {
    private String name;
    private double price;
    private ComputerPart parent;

    public ComputerPart(String name, double price, ComputerPart parent) {
        this.name = name;
        this.price = price;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public abstract String getSpecifications();
}
