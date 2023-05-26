package Chapter_01_STRATEGY.SimUDuck.models;

import Chapter_01_STRATEGY.SimUDuck.behaviors.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
