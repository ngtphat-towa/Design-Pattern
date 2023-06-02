package Chatper_04_FACTORY.METHOD.models.Pizza.PizzaStyles.California;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "California Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Fresh Tomato Sauce";
        
        toppings.add("Fresh Mozzarella Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Fresh Basil");
    }
}
