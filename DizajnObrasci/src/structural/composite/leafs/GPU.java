package structural.composite.leafs;

import structural.composite.ComputerPart;
import structural.composite.ComputerPartLeaf;

public class GPU extends ComputerPartLeaf {
    public GPU(String name, double price, ComputerPart parent) {
        super(name, price, parent);
    }

    @Override
    public String getSpecifications() {
        return "GPU " + getName();
    }
}