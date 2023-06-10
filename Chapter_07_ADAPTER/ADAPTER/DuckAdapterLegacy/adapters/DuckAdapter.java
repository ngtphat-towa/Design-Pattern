package Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.adapters;

import java.util.Random;

import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Ducks.Duck;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Turkeys.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
