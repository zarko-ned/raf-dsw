package creational.factory.pizza.CaliforniaStyle;


import creational.factory.pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {

    public CaliforniaStylePepperoniPizza() {
        this.setName("CaliforniaStyle Pepperoni pizza");
    }

    @Override
    public void prepare() {
        System.out.printf("CaliforniaStyle Pepperoni pizza preparation. ");
    }

    @Override
    public void bake() {
        System.out.printf("CaliforniaStyle Pepperoni pizza baking. ");
    }

    @Override
    public void cut() {
        System.out.printf("CaliforniaStyle Pepperoni pizza cutting. ");
    }

    @Override
    public void box() {
        System.out.printf("CaliforniaStyle Pepperoni pizza boxing. ");
    }
}
