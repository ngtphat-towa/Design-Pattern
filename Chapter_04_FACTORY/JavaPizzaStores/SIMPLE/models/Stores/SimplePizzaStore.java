package Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Stores;

import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.factories.SimplePizzaFactory;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.PizzaType;

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