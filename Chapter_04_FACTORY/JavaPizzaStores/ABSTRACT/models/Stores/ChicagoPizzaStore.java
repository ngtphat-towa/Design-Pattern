package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.ChicagoPizzaIngredientFactory;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.PizzaIngredientFactory;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.CheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.ClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case clam:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case pepperoni:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case veggie:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;

        }
        return pizza;
    }
}
