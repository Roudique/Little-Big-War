package com.roudique.lbw.units;

import com.roudique.lbw.utils.Spells;

    /*
    * Magic unit - Healer, v1
    */
public class Healer extends Spellcaster {
    
    public Healer() {
        this.maxHitPoints = DEFAULT_MAGE_MAX_HP;
        this.hitPoints = DEFAULT_MAGE_MAX_HP;;
        this.damage = DEFAULT_MAGE_ATTACK;
        this.manaPoints = DEFAULT_MAGE_MP;
        this.maxManaPoints = DEFAULT_MAGE_MP;
    }
    
    
    @Override
    public void castHeal(Unit target) throws NoManaPointsException, NoHitPointsException{
        consumeManaPoints(Spells.HEAL_MANACOST);
        Spells.heal(target);
    }
    
    @Override
    public void castFireball(Unit target) throws NoManaPointsException {
        consumeManaPoints(Spells.FIREBALL_MANACOST);
        Spells.badFireBall(target);
    }
    
    @Override
    public String toString() {
        return String.format("Healer\'s id is: %s\n---Hit Points: %s/%s\n---Mana Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                manaPoints, maxManaPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Healer";
    }
}