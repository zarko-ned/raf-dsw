package structural.composite;

// Computer part composite predstavlja node leaf
public abstract class ComputerPartLeaf extends ComputerPart{
    public ComputerPartLeaf(String name, double price) {
        super(name, price);
    }
}
