package Chapter_01_STRATEGY.SimUDuck;

import Chapter_01_STRATEGY.SimUDuck.models.*;


public class MiniDuckSimulator {
    public static void main(String[] args) {
        /// Mallard Duck Model
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        /// Duck Model
        Duck model = new DuckModel();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
