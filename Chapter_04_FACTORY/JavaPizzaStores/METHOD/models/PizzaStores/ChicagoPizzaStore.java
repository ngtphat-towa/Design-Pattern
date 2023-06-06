package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.PizzaStores;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleCheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStylePepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.Chicago.ChicagoStyleVeggiePizza;

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
