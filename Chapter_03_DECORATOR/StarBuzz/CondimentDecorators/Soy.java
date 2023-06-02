package Chapter_03_DECORATOR.StarBuzz.CondimentDecorators;

import Chapter_03_DECORATOR.StarBuzz.Beverages.Beverage;
import Chapter_03_DECORATOR.StarBuzz.Beverages.DrinkSize;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return DrinkSize.getCostBySize(beverage);


    }
}