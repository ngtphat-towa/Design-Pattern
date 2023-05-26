package Chapter_01_STRATEGY.DesignPuzzle.models.behaviors;

public class KnifeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }

}
