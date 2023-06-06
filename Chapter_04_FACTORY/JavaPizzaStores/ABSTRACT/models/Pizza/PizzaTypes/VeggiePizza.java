package Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes;

import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.PizzaIngredientFactory;
import Chapter_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
