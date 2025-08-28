package creational.factory.pizza.CaliforniaStyle;


import creational.factory.pizza.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {


    public CaliforniaStyleVeggiePizza() {
        this.setName("CaliforniaStyle Veggie pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("CaliforniaStyle Veggie pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("CaliforniaStyle Veggie pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("CaliforniaStyle Veggie pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("CaliforniaStyle Veggie pizza boxing. ");
    }

}
