package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores.ChicagoPizzaStore;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores.NYPizzaStore;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Stores.PizzaStore;


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
