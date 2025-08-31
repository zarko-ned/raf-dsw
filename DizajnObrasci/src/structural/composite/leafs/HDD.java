package structural.composite.leafs;

import structural.composite.ComputerPartLeaf;

public class HDD extends ComputerPartLeaf {
    public HDD(String name, double price) {
        super(name, price);
    }

    @Override
    public String getSpecifications() {
        return "HDD " + getName();
    }
}