package creational.factory.pizza.ChicagoStyle;


import creational.factory.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        this.setName("ChicagoStyle Veggie pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("ChicagoStyle Veggie pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("ChicagoStyle Veggie pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("ChicagoStyle Veggie pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("ChicagoStyle Veggie pizza boxing. ");
    }

}
