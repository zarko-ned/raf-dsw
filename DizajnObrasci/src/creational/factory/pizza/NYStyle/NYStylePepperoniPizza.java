package creational.factory.pizza.NYStyle;


import creational.factory.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        this.setName("NYStyle Pepperoni pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("NYStyle Pepperoni pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("NYStyle Pepperoni pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("NYStyle Pepperoni pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("NYStyle Pepperoni pizza boxing. ");
    }
}
