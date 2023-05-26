package Chapter_01_STRATEGY.DesignPuzzle.models.behaviors;

public class BowAndArrowBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Shoot-ing an arrow with a bowing an arrow with a bow");
    }

}
