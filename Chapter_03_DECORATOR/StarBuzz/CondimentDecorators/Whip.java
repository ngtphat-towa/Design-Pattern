package Chapter_03_DECORATOR.StarBuzz.CondimentDecorators;

import Chapter_03_DECORATOR.StarBuzz.Beverages.Beverage;
import Chapter_03_DECORATOR.StarBuzz.Beverages.DrinkSize;


public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return DrinkSize.getCostBySize(beverage);

    }
}