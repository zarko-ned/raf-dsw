package creational.factory.pizza.ChicagoStyle;


import creational.factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        this.setName("ChicagoStyle Pepperoni pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("ChicagoStyle Pepperoni pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("ChicagoStyle Pepperoni pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("ChicagoStyle Pepperoni pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("ChicagoStyle Pepperoni pizza boxing. ");
    }
}
