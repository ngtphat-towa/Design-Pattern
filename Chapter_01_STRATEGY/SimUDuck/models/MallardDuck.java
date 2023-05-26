package Chapter_01_STRATEGY.SimUDuck.models;

import Chapter_01_STRATEGY.SimUDuck.behaviors.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

        System.out.println("I’m a real Mallard duck");
    }

}
