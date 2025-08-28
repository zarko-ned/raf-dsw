package creational.factory;

import creational.factory.pizza.Pizza;
import creational.factory.store.CaliforniaPizzaStore;
import creational.factory.store.ChicagoPizzaStore;
import creational.factory.store.NYPizzaStore;
import creational.factory.store.PizzaStore;

public class MainProgram {


    public static void main(String[] args) {

        PizzaStore store = returnPizzaStore(args[0]);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = store.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


    }

    private static PizzaStore returnPizzaStore(String type) {

        if (type.equalsIgnoreCase("chicago")) return new ChicagoPizzaStore();
        else if (type.equalsIgnoreCase("ny")) return new NYPizzaStore();
        else if (type.equalsIgnoreCase("california")) return new CaliforniaPizzaStore();
        return null;

    }

}
