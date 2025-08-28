package creational.factory.pizza;

// Fabrike prave proizvode, i u PizzaStore klasi, nas proizvod je Pizza.
// Sve podklase su konkretni proizvodi -sve pice su napravljene u nasim farbikama.

public abstract class Pizza {

    private String name;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
