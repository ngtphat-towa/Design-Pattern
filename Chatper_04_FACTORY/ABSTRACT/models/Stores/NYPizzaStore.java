package Chatper_04_FACTORY.ABSTRACT.models.Stores;

import Chatper_04_FACTORY.ABSTRACT.factories.NYPizzaIngredientFactory;
import Chatper_04_FACTORY.ABSTRACT.factories.PizzaIngredientFactory;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Pizza;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.CheesePizza;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.ClamPizza;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.PepperoniPizza;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.VeggiePizza;

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