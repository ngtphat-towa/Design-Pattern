package Chapter_01_STRATEGY.DesignPuzzle.models.behaviors;

public class SwordBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swing-ing a sword");
    }

}
