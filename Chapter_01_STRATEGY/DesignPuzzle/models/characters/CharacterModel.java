package Chapter_01_STRATEGY.DesignPuzzle.models.characters;

public class CharacterModel extends Character {

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public void display() {
      System.out.println("I'm generic character");
    }

}
