package creational.factory.pizza.CaliforniaStyle;


import creational.factory.pizza.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        this.setName("CaliforniaStyle Cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("CaliforniaStyle Cheese pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("CaliforniaStyle Cheese pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("CaliforniaStyle Cheese pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("CaliforniaStyle Cheese pizza boxing. ");
    }
}
