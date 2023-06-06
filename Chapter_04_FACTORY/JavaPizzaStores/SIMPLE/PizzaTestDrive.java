package Chapter_04_FACTORY.JavaPizzaStores.SIMPLE;

import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.factories.SimplePizzaFactory;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.Pizza;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza.PizzaType;
import Chapter_04_FACTORY.JavaPizzaStores.SIMPLE.models.Stores.SimplePizzaStore;

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
