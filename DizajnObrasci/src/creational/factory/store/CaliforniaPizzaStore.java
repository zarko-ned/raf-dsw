package creational.factory.store;


import creational.factory.pizza.CaliforniaStyle.CaliforniaStyleCheesePizza;
import creational.factory.pizza.CaliforniaStyle.CaliforniaStylePepperoniPizza;
import creational.factory.pizza.CaliforniaStyle.CaliforniaStyleVeggiePizza;
import creational.factory.pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) pizza = new CaliforniaStyleCheesePizza();
        else if(type.equals("pepperoni")) pizza = new CaliforniaStylePepperoniPizza();
        else if(type.equals("veggie")) pizza = new CaliforniaStyleVeggiePizza();
        return pizza;
    }
}
