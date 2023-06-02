package Chatper_04_FACTORY.METHOD.models.PizzaStores;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaType;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleCheesePizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleClamPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.NewYork.NYStylePepperoniPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case cheese:
                pizza = new NYStyleCheesePizza();
                break;
            case clam:
                pizza = new NYStyleClamPizza();
                break;
            case pepperoni:
                pizza = new NYStylePepperoniPizza();
                break;
            case veggie:
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}