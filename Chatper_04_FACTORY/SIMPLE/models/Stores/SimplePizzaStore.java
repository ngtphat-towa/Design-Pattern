package Chatper_04_FACTORY.SIMPLE.models.Stores;

import Chatper_04_FACTORY.SIMPLE.factories.SimplePizzaFactory;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.Pizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.PizzaType;

public class SimplePizzaStore {

    SimplePizzaFactory pizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}