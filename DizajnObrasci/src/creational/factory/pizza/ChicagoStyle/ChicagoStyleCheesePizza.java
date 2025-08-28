package creational.factory.pizza.ChicagoStyle;


import creational.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.setName("ChicagoStyle Cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("ChicagoStyle Cheese pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("ChicagoStyle Cheese pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("ChicagoStyle Cheese pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("ChicagoStyle Cheese pizza boxing. ");
    }
}
