package structural.composite.leafs;

import structural.composite.ComputerPartLeaf;

public class GPU extends ComputerPartLeaf {
    public GPU(String name, double price) {
        super(name, price);
    }

    @Override
    public String getSpecifications() {
        return "GPU " + getName();
    }
}