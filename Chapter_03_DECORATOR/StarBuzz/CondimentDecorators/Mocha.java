package Chapter_03_DECORATOR.StarBuzz.CondimentDecorators;

import Chapter_03_DECORATOR.StarBuzz.Beverages.Beverage;
import Chapter_03_DECORATOR.StarBuzz.Beverages.DrinkSize;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return DrinkSize.getCostBySize(beverage);
    }
}