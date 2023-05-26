package Chapter_01_STRATEGY.DesignPuzzle.models.characters;

import Chapter_01_STRATEGY.DesignPuzzle.models.behaviors.IWeaponBehavior;

public abstract class Character {
    IWeaponBehavior weapon;

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(IWeaponBehavior w) {
        this.weapon = w;
    }
}