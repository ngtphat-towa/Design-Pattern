package Chatper_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California;

import Chatper_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Fresh Tomato Sauce";
        
        toppings.add("Fresh Mozzarella Cheese");
        toppings.add("Sliced Tomatoes");
        toppings.add("Fresh Basil");
    }
}
