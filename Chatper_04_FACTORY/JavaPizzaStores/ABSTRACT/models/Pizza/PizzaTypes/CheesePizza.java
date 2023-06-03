package Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.PizzaTypes;

import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.factories.PizzaIngredientFactory;
import Chatper_04_FACTORY.JavaPizzaStores.ABSTRACT.models.Pizza.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
