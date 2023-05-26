package Chapter_01_STRATEGY.SimUDuck.behaviors;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
