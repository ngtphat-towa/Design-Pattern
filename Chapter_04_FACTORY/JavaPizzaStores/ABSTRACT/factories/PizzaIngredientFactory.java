package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}