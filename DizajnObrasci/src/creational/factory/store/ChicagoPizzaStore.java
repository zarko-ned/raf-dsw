package creational.factory.store;


import creational.factory.pizza.ChicagoStyle.ChicagoStyleCheesePizza;
import creational.factory.pizza.ChicagoStyle.ChicagoStylePepperoniPizza;
import creational.factory.pizza.ChicagoStyle.ChicagoStyleVeggiePizza;
import creational.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) pizza = new ChicagoStyleCheesePizza();
        else if (type.equals("pepperoni")) pizza = new ChicagoStylePepperoniPizza();
        else if (type.equals("veggie")) pizza = new ChicagoStyleVeggiePizza();
        return pizza;
    }
}
