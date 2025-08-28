package creational.factory.store;


// createPizza() metod je nas factory method. On pravi proizvode.
// Klase koje prave prozvode nazivamo konkretnim kreatorima.

import creational.factory.pizza.NYStyle.NYStyleCheesePizza;
import creational.factory.pizza.NYStyle.NYStylePepperoniPizza;
import creational.factory.pizza.NYStyle.NYStyleVeggiePizza;
import creational.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) pizza = new NYStyleCheesePizza();
        else if (type.equals("pepperoni")) pizza = new NYStylePepperoniPizza();
        else if (type.equals("veggie")) pizza = new NYStyleVeggiePizza();
        return pizza;
    }
}
