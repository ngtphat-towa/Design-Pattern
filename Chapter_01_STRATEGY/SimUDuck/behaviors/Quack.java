package Chapter_01_STRATEGY.SimUDuck.behaviors;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
