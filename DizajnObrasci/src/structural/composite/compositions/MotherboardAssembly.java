package structural.composite.compositions;

import structural.composite.ComputerPart;
import structural.composite.ComputerPartComposite;

// Sadrzi GPU i CPU
public class MotherboardAssembly extends ComputerPartComposite {
    public MotherboardAssembly(String name, double price, ComputerPart parent) {
        super(name, price, parent);
    }

    @Override
    public void addPart(ComputerPart part) {
        super.getChildren().add(part);
    }

    @Override
    public void removePart(ComputerPart part) {
        super.getChildren().remove(part);
    }

    @Override
    public String getSpecifications() {
        return "Motherboard assembly " + getName();
    }
}
