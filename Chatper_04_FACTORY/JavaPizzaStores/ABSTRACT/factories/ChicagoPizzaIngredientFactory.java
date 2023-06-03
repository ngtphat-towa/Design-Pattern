package Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.factories;

import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.MozzarellaCheese;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.FrozenClams;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.ThickCrustDough;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.SlicedPepperoni;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.PlumTomatoSauce;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.BlackOlives;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Eggplant;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Spinach;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

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
