package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.NewYork;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
