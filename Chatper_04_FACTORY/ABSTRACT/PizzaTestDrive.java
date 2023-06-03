package Chatper_04_FACTORY.ABSTRACT;

import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Pizza;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;
import Chatper_04_FACTORY.ABSTRACT.models.Stores.ChicagoPizzaStore;
import Chatper_04_FACTORY.ABSTRACT.models.Stores.NYPizzaStore;
import Chatper_04_FACTORY.ABSTRACT.models.Stores.PizzaStore;


public class PizzaTestDrive {
    public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza(PizzaType.cheese);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.cheese);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.clam);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.clam);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.pepperoni);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.pepperoni);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.veggie);
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza(PizzaType.veggie);
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
