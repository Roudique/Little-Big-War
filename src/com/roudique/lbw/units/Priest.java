package com.roudique.lbw.units;

import com.roudique.lbw.utils.Spells;

    /*
    * Magic unit - Priest, v1
    * Versions:
    *   v1 - standard
    *   v2 - buffs
    */
public class Priest extends Spellcaster {
    
    public Priest() {
        this.maxHitPoints = DEFAULT_MAGE_MAX_HP;
        this.hitPoints = DEFAULT_MAGE_MAX_HP;;
        this.damage = DEFAULT_MAGE_ATTACK;
        this.manaPoints = DEFAULT_MAGE_MP;
        this.maxManaPoints = DEFAULT_MAGE_MP;
    }
    
    
    @Override
    public void castHeal(Unit target) throws NoManaPointsException, NoHitPointsException {
        consumeManaPoints(Spells.HEAL_MANACOST);
        Spells.badHeal(target);
    }
    
    @Override
    public void castFireball(Unit target) throws NoManaPointsException {
        consumeManaPoints(Spells.FIREBALL_MANACOST);
        if ( target instanceof Vampire || target instanceof Necromancer ) {
            Spells.holyFireBall((Undead)target);
        } else {
            Spells.badFireBall(target);
        }
    }
    
    public void castBuff(Unit target) throws NoManaPointsException, NoHitPointsException {
        consumeManaPoints(Spells.BUFF_MANACOST);
        Spells.buff(target);
    }
    public void castDebuff(Unit target) throws NoManaPointsException, NoHitPointsException {
        consumeManaPoints(Spells.DEBUFF_MANACOST);
        Spells.debuff(target);
    }
    
    @Override
    public String toString() {
        return String.format("Priest\'s id is: %s\n---Hit Points: %s/%s\n---Mana Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                manaPoints, maxManaPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Priest";
    }
}