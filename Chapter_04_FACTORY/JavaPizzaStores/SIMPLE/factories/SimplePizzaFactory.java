package Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.factories;

import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.CheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.ClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.PepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case cheese:
                pizza = new CheesePizza();
                break;
            case clam:
                pizza = new ClamPizza();
                break;
            case pepperoni:
                pizza = new PepperoniPizza();

                break;
            case veggie:
                pizza = new VeggiePizza();
                break;
            default:
                break;

        }
        return pizza;
    }

}