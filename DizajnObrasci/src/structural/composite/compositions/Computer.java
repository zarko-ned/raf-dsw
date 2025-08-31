package structural.composite.compositions;

import structural.composite.ComputerPart;
import structural.composite.ComputerPartComposite;

public class Computer extends ComputerPartComposite {
    public Computer(String name, double price) {
        super(name, price);
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
        String spec = "Computer specifications:+\n";
        for (ComputerPart part : super.getChildren()) {
            spec += part.getSpecifications();
        }
        return spec;
    }
}
