package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Cheese.Cheese;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Clams.Clams;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Dough.Dough;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Pepperoni.Pepperoni;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Sauces.Sauce;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Ingredients.Veggies.Veggies;

public abstract class Pizza {
	protected String name;

	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
