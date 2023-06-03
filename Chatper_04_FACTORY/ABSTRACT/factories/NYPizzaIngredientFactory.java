package Chatper_04_FACTORY.ABSTRACT.factories;

import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Cheese.ReggianoCheese;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Clams.FreshClams;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Dough.ThinCrustDough;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Pepperoni.SlicedPepperoni;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Sauces.MarinaraSauce;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Veggies.Garlic;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Veggies.Mushroom;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Veggies.Onion;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Veggies.RedPepper;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

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
