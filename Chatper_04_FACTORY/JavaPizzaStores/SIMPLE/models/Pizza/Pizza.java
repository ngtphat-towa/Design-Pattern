package Chatper_04_FACTORY.JavaPizzaStores.SIMPLE.models.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();

    /// Getter and Setter
    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    /// Pizza Processing
    public void bake() {
        System.out.println("Baking " + getName());
    }

    public void cut() {
        System.out.println("Cutting " + getName());
    }

    public void box() {
        System.out.println("Boxing " + getName() + " in an official PizzaStore box");
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        if (!toppings.isEmpty())
            for (String topping : toppings) {
                display.append(topping + "\n");
            }
        return display.toString();
    }

}
