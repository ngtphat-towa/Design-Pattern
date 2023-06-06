package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.ReggianoCheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.FreshClams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.ThinCrustDough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.SlicedPepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.MarinaraSauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Garlic;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Mushroom;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Onion;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.RedPepper;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
