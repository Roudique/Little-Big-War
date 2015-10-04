package com.roudique.lbw.units;

public class Rogue extends Unit {
    private static final int ROGUE_MAX_HP = 95;
    private static final int DEFAULT_ROGUE_DAMAGE = 24;
    
    public Rogue() {
        this.maxHitPoints = ROGUE_MAX_HP;
        this.hitPoints = ROGUE_MAX_HP;
        this.damage = DEFAULT_ROGUE_DAMAGE;
    }
    
    public Rogue(int hp, int dmg) {
        this.maxHitPoints = ROGUE_MAX_HP;
        this.hitPoints = hp;
        this.damage = dmg;
    }
    
    @Override
    public String toString() {
        return String.format("Rogue\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Rogue";
    }
}