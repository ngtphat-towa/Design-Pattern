package Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy;

import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.adapters.TurkeyAdapter;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Ducks.Duck;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Ducks.MallardDuck;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Turkeys.Turkey;
import Chapter_07_ADAPTER.ADAPTER.DuckAdapterLegacy.models.Turkeys.WildTurkey;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}