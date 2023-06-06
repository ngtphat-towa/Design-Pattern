package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.PizzaStores;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleCheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.NewYork.NYStylePepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.NewYork.NYStyleVeggiePizza;

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