package Chatper_04_FACTORY.METHOD.models.PizzaStores;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaType;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleCheesePizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleClamPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStylePepperoniPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

	public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case cheese:
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case clam:
                pizza = new CaliforniaStyleClamPizza();
                break;
            case pepperoni:
                pizza = new CaliforniaStylePepperoniPizza();
                break;
            case veggie:
                pizza = new CaliforniaStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}