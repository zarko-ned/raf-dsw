package structural.composite.leafs;

import structural.composite.ComputerPartLeaf;

public class CPU extends ComputerPartLeaf {
    public CPU(String name, double price) {
        super(name, price);
    }

    @Override
    public String getSpecifications() {
        return "CPU " + getName();
    }
}
