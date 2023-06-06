package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.NYPizzaIngredientFactory;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.PizzaIngredientFactory;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.CheesePizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.ClamPizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PepperoniPizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
            switch (type) {
                case cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                    break;
                case clam:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                    break;
                case pepperoni:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                    break;
                case veggie:
                    
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
                    break;
    
            }

		return pizza;
	}
}