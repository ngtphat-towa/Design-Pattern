package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Garlic and Olive Oil Sauce";

        toppings.add("Fresh Mozzarella Cheese");
        toppings.add("Chopped Clams");
        toppings.add("Grated Parmesan Cheese");
        toppings.add("Fresh Parsley");
    }
}
