package com.roudique.lbw.units;

import com.roudique.lbw.utils.Spells;

    /*
    * Magic unit - Necromancer, v1
    */
public class Necromancer extends Spellcaster implements Observer, Undead {
    
    public Necromancer() {
        this.maxHitPoints = DEFAULT_MAGE_MAX_HP;
        this.hitPoints = DEFAULT_MAGE_MAX_HP;;
        this.damage = DEFAULT_MAGE_ATTACK;
        this.manaPoints = DEFAULT_MAGE_MP;
        this.maxManaPoints = DEFAULT_MAGE_MP;
    }
    
    @Override
    public void acceptHolyDamage(int damage) {
        damage *= 2;
        this.acceptDamage(damage, Unit.DamageType.MAGICAL);
    }
    
    @Override
    public void consumeSoul(Unit target) {
        int leechedHitPoints = target.getMaxHitPoints() / 2;
        try {
            this.addHitPoints(leechedHitPoints);
        } catch ( NoHitPointsException e ) {}
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
        updateObserver(target);
    }
    @Override
    protected void doDamage(Unit target) {
        super.doDamage(target);
        updateObserver(target);
    }
    @Override
    protected void counterAttack(Unit target) {
        super.counterAttack(target);
        updateObserver(target);
    }
    private void updateObserver(Unit target) {
        if ( target.getObserver() != this ) {
            target.setObserver(this);
        }
    }
    
    @Override
    public String toString() {
        return String.format("Necromancer\'s id is: %s\n---Hit Points: %s/%s\n---Mana Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                manaPoints, maxManaPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Necromancer";
    }
}