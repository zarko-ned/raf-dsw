package creational.factory.pizza;

//Factories produce products, and in the PizzaStore, our product is a Pizza.
// All its subclasses are the concrete products - all the pizzas that are produced by our stores.

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
