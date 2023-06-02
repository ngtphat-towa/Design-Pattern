package Chapter_03_DECORATOR.StarBuzz.CondimentDecorators;

import Chapter_03_DECORATOR.StarBuzz.Beverages.Beverage;
import Chapter_03_DECORATOR.StarBuzz.Beverages.DrinkSize;


public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return DrinkSize.getCostBySize(beverage);

    }
}