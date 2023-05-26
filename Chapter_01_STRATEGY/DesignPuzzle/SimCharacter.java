package Chapter_01_STRATEGY.DesignPuzzle;

import Chapter_01_STRATEGY.DesignPuzzle.models.behaviors.BowAndArrowBehavior;
import Chapter_01_STRATEGY.DesignPuzzle.models.behaviors.IWeaponBehavior;
import Chapter_01_STRATEGY.DesignPuzzle.models.behaviors.SwordBehavior;
import Chapter_01_STRATEGY.DesignPuzzle.models.characters.*;
import Chapter_01_STRATEGY.DesignPuzzle.models.characters.Character;;

public class SimCharacter {

    public static void setUpCharacter(Character c, IWeaponBehavior w) {
        c.setWeapon(w);
        c.display();
        c.fight();
    }

    public static void main(String[] args) {
        /// Sword
        IWeaponBehavior swordBehavior = new SwordBehavior();
        /// Behavior 
        IWeaponBehavior  bowAndArrowBehavior= new BowAndArrowBehavior();

        /// King
        Character kingCharacter = new King();
        setUpCharacter(kingCharacter, swordBehavior);

        /// Queen
        Character queenCharacter = new Queen();
        setUpCharacter(queenCharacter, bowAndArrowBehavior);

    }
}
