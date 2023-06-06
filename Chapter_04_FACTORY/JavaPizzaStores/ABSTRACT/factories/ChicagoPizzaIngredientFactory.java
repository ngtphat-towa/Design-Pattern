package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.MozzarellaCheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.FrozenClams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.ThickCrustDough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.SlicedPepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.PlumTomatoSauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.BlackOlives;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Eggplant;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Spinach;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
