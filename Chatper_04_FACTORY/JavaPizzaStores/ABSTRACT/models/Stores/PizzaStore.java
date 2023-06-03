package Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores;

import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(PizzaType type);
 
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
