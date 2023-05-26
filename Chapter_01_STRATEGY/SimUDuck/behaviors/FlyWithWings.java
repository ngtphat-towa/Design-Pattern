package Chapter_01_STRATEGY.SimUDuck.behaviors;

public class FlyWithWings implements IFlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying!!");
  }

}
