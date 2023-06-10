package Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy;

import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.adapters.DuckAdapter;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Ducks.MallardDuck;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Turkeys.Turkey;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<5;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
