package Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.PizzaStyles.California;

import Chapter_04_FACTORY.JavaPizzaStores.METHOD.models.Pizza.Pizza;

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
