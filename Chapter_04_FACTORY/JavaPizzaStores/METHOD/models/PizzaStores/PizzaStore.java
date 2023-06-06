package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.PizzaStores;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaType;

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