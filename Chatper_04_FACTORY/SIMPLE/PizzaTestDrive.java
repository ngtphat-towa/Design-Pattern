package Chatper_04_FACTORY.SIMPLE;

import Chatper_04_FACTORY.SIMPLE.factories.SimplePizzaFactory;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.Pizza;
import Chatper_04_FACTORY.SIMPLE.models.Pizza.PizzaType;
import Chatper_04_FACTORY.SIMPLE.models.Stores.SimplePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
        SimplePizzaStore store = new SimplePizzaStore(factory);

		Pizza pizza = store.orderPizza(PizzaType.cheese);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
        
		pizza = store.orderPizza(PizzaType.veggie);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
