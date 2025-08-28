package creational.factory.pizza.NYStyle;


import creational.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.setName("NYStyle Cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("NYStyle Cheese pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("NYStyle Cheese pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("NYStyle Cheese pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("NYStyle Cheese pizza boxing. ");
    }
}
