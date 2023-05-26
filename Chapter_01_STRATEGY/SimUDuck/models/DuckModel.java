package Chapter_01_STRATEGY.SimUDuck.models;

import Chapter_01_STRATEGY.SimUDuck.behaviors.FlyNoWay;
import Chapter_01_STRATEGY.SimUDuck.behaviors.Quack;

public class DuckModel extends Duck {
    public DuckModel() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
