package creational.factory.store;


//The createPizza() method is our factory method. It produces products.
//Classes that produce products are called concrete creators.

import creational.factory.pizza.NYStyle.NYStyleCheesePizza;
import creational.factory.pizza.NYStyle.NYStylePepperoniPizza;
import creational.factory.pizza.NYStyle.NYStyleVeggiePizza;
import creational.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) pizza = new NYStyleCheesePizza();
        else if(type.equals("pepperoni")) pizza = new NYStylePepperoniPizza();
        else if(type.equals("veggie")) pizza = new NYStyleVeggiePizza();
        return pizza;
    }
}
