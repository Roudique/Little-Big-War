package com.roudique.lbw.units;

public class Vampire extends Unit implements Undead
{
    private static final int VAMPIRE_MAX_HP = 85;
    private static final int DEFAULT_VAMPIRE_DAMAGE = 22;
    private static final double VAMPIRISM_RATE = 0.4;
    
    public Vampire() {
        this.maxHitPoints = VAMPIRE_MAX_HP;
        this.hitPoints = VAMPIRE_MAX_HP;;
        this.damage = DEFAULT_VAMPIRE_DAMAGE;
    }
    
    public Vampire(int hp, int dmg) {
        this.maxHitPoints = VAMPIRE_MAX_HP;
        this.hitPoints = hp;
        this.damage = dmg;
    }
    
    @Override
    protected void doDamage(Unit target) {
        target.acceptDamage(this.damage, Unit.DamageType.PHYSICAL);
        Double vampirismValueDouble = DEFAULT_VAMPIRE_DAMAGE * VAMPIRISM_RATE;
        int vampirismValueInt = vampirismValueDouble.intValue();
        try {
            addHitPoints(vampirismValueInt);
        } catch ( NoHitPointsException e ) {
            e.printStackTrace();
        }
    }
    @Override
    protected void counterAttack(Unit target) {
        target.acceptDamage(this.damage / 2, Unit.DamageType.PHYSICAL);
        this.hitPoints += this.damage * VAMPIRISM_RATE;
    }
    @Override
    public void acceptHolyDamage(int damage) {
        damage *= 2;
        this.acceptDamage(damage, Unit.DamageType.PHYSICAL);
    }
    
    @Override
    public String toString() {
        return String.format("Vampire\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Vampire";
    }
}