package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Computer part composite predstavlja node composite
public abstract class ComputerPartComposite extends ComputerPart {
    private List<ComputerPart> children;

    public ComputerPartComposite(String name, double price) {
        super(name, price);
        this.children = new ArrayList<>();
    }

    public abstract void addPart(ComputerPart part);

    public abstract void removePart(ComputerPart part);

    public List<ComputerPart> getChildren() {
        return this.children;
    }
}