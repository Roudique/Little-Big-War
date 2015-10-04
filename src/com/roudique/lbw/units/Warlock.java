package com.roudique.lbw.units;

import com.roudique.lbw.utils.Spells;

    /*
    * Magic unit - Warlock, v1
    */
public class Warlock extends Spellcaster {
    public Demon demon;
    
    public Warlock() {
        this.maxHitPoints = DEFAULT_MAGE_MAX_HP;
        this.hitPoints = DEFAULT_MAGE_MAX_HP;;
        this.damage = DEFAULT_MAGE_ATTACK;
        this.manaPoints = DEFAULT_MAGE_MP;
        this.maxManaPoints = DEFAULT_MAGE_MP;
    }
    
    public void castSummonDemon() throws NoManaPointsException {
        try {
            consumeManaPoints(Spells.DEMON_MANACOST);
            Spells.summonDemon(this);
        } catch ( DemonAlreadyExistsException e) {
            demon.die();
            demon = new Demon(this);
        }
    }
    
    @Override
    public void castHeal(Unit target) throws NoManaPointsException, NoHitPointsException {
        consumeManaPoints(Spells.HEAL_MANACOST);
        Spells.badHeal(target);
    }
    
    @Override
    public void castFireball(Unit target) throws NoManaPointsException {
        consumeManaPoints(Spells.FIREBALL_MANACOST);
        Spells.badFireBall(target);
    }
    
    @Override
    public String toString() {
        return String.format("Warlock\'s id is: %s\n---Hit Points: %s/%s\n---Mana Points: %s/%s\n---Damage: %s\n---Has demon: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                manaPoints, maxManaPoints,
                                damage,
                                demon);
    }
    
    @Override
    public String getName() {
        return "Warlock";
    }
}