
package Chapter_01_STRATEGY.SimUDuck.behaviors;

/**
 * FlyNoWay
 */
public class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}