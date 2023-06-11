package Chapter_08_TEMPLATE_METHOD.JavaImp.SimpleBarista.drinks;

public class Tea {
    public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
 
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}
 
	public void addLemon() {
		System.out.println("Adding Lemon");
	}
 
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
