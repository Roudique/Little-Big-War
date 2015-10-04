package com.roudique.lbw.units;

public class Demon extends Warrior
{
    private static final int DEMON_MAX_HP = 120;
    private static final int DEFAULT_DEMON_DAMAGE = 18;
    private Warlock summoner;
    
    public Demon(Warlock summ) {
        this.maxHitPoints = DEMON_MAX_HP;
        this.hitPoints = DEMON_MAX_HP;
        this.damage = DEFAULT_DEMON_DAMAGE;
        this.summoner = summ;
    }
    
    @Override
    public String toString() {
        return String.format("Demon\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Demon";
    }
}