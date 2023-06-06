package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.PizzaStores;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleCheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStylePepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California.CaliforniaStyleVeggiePizza;

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