package Chapter_03_DECORATOR.StarBuzz;

import Chapter_03_DECORATOR.StarBuzz.Beverages.Beverage;
import Chapter_03_DECORATOR.StarBuzz.Beverages.DarkRoast;
import Chapter_03_DECORATOR.StarBuzz.Beverages.Espresso;
import Chapter_03_DECORATOR.StarBuzz.Beverages.HouseBlend;
import Chapter_03_DECORATOR.StarBuzz.Beverages.Size;
import Chapter_03_DECORATOR.StarBuzz.CondimentDecorators.Mocha;
import Chapter_03_DECORATOR.StarBuzz.CondimentDecorators.Soy;
import Chapter_03_DECORATOR.StarBuzz.CondimentDecorators.Whip;

// Our friends at Starbuzz have introduced sizes to their menu. You can now order 
// a coffee in tall, grande, and venti sizes (translation: small, medium, and large). 
// Starbuzz saw this as an intrinsic part of the coffee class, so they’ve added two 
// methods to the Beverage class: setSize() and getSize(). They’d also like for the 
// condiments to be charged according to size, so for instance, Soy costs 10¢, 15¢ 
// and 20¢ respectively for tall, grande, and venti coffees
public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setDrinkSize(Size.SHORT);
        
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage2.setDrinkSize(Size.GRANDE);

        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
