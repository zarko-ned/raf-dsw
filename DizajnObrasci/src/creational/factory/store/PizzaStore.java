package creational.factory.store;


// Ovo je nasa apstraktna kreator klasa.
// Ona definise apstraktnu metodu fabrike koju podklase implementiraju da proizvode proizvode.
// Cesto kreator sadrzi kod koji zavisi od apstraktnog proizvoda, a koji proizvodi podklasa.
// Kreator nikad zapravo ne zna koji konkretni proizvod je proizveden.

import creational.factory.pizza.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
