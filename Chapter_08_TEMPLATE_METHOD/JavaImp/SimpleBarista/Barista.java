package Chapter_08_TEMPLATE_METHOD.JavaImp.SimpleBarista;

import Chapter_08_TEMPLATE_METHOD.JavaImp.SimpleBarista.drinks.Coffee;
import Chapter_08_TEMPLATE_METHOD.JavaImp.SimpleBarista.drinks.Tea;

public class Barista {
    
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	} 
}
