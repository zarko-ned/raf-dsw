package structural.composite.compositions;

import structural.composite.ComputerPart;
import structural.composite.ComputerPartComposite;

public class StorageSystem extends ComputerPartComposite {
    public StorageSystem(String name, double price, ComputerPart parent) {
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
        String spec = "";
        for (ComputerPart part : getChildren()) {
            spec += part.getName() + "\n";
        }
        return spec;
    }
}
