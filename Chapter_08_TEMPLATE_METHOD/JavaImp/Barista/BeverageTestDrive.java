package Chapter_08_TEMPLATE_METHOD.JavaImp.Barista;

import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks.Coffee;
import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks.CoffeeWithHook;
import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks.Tea;
import Chapter_08_TEMPLATE_METHOD.JavaImp.Barista.Drinks.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
