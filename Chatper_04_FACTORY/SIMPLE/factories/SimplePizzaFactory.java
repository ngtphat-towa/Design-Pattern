package Chatper_04_FACTORY.SIMPLE.factories;

import Chatper_04_FACTORY.SIMPLE.models.Pizza.CheesePizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.ClamPizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.PepperoniPizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.Pizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.PizzaType;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.VeggiePizza;

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