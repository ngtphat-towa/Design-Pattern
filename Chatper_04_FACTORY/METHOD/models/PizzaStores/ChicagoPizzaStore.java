package Chatper_04_FACTORY.METHOD.models.PizzaStores;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaType;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleCheesePizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleClamPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStylePepperoniPizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case cheese:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case clam:
                pizza = new ChicagoStyleClamPizza();
                break;
            case pepperoni:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case veggie:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
