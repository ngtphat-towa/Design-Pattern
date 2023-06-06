package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {

    public CaliforniaStyleVeggiePizza() {
        name = "California Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Fresh Tomato Sauce";

        toppings.add("Fresh Mozzarella Cheese");
        toppings.add("Sliced Bell Peppers");
        toppings.add("Sliced Red Onions");
        toppings.add("Sliced Mushrooms");
        toppings.add("Chopped Spinach");
    }
}