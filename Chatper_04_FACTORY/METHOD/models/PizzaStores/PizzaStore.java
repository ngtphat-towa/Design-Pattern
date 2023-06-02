package Chatper_04_FACTORY.METHOD.models.PizzaStores;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaType;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    /// The factory methods
    public abstract Pizza createPizza(PizzaType type);
}