package Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.adapters;

import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Ducks.Duck;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Turkeys.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
