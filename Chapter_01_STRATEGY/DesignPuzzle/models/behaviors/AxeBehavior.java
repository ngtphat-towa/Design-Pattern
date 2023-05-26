package Chapter_01_STRATEGY.DesignPuzzle.models.behaviors;

public class AxeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chop-ping with an axe");
    }

}
