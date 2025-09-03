package structural.composite.leafs;

import structural.composite.ComputerPart;
import structural.composite.ComputerPartLeaf;

public class CPU extends ComputerPartLeaf {
    public CPU(String name, double price, ComputerPart parent) {
        super(name, price, parent);
    }

    @Override
    public String getSpecifications() {
        return "CPU " + getName();
    }
}
