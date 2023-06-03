package Chatper_04_FACTORY.ABSTRACT.models.Pizza.PizzaTypes;

import Chatper_04_FACTORY.ABSTRACT.factories.PizzaIngredientFactory;
import Chatper_04_FACTORY.ABSTRACT.models.Pizza.Pizza;

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
