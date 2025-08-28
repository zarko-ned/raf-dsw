package creational.factory.pizza.NYStyle;


import creational.factory.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {


    public NYStyleVeggiePizza() {
        this.setName("NYStyle Veggie pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("NYStyle Veggie pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("NYStyle Veggie pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("NYStyle Veggie pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("NYStyle Veggie pizza boxing. ");
    }

}
