package Chapter_09_ITERATOR_COMPOSITE.ITERATOR.CafeDinerMerger;

import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.CafeDinerMerger.Menu.CafeMenu;
import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.CafeDinerMerger.Menu.DinerMenu;
import Chapter_09_ITERATOR_COMPOSITE.ITERATOR.CafeDinerMerger.Menu.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Waffles vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
