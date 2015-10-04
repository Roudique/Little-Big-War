package com.roudique.lbw.units;

public class Warrior extends Unit
{
    private static final int WARRIOR_MAX_HP = 100;
    private static final int DEFAULT_WARRIOR_DAMAGE = 25;
    
    public Warrior() {
        this.maxHitPoints = WARRIOR_MAX_HP;
        this.hitPoints = WARRIOR_MAX_HP;
        this.damage = DEFAULT_WARRIOR_DAMAGE;
    }
    
    public Warrior(int hp, int dmg) {
        this.maxHitPoints = WARRIOR_MAX_HP;
        this.hitPoints = hp;
        this.damage = dmg;
    }
    
    @Override
    public String toString() {
        return String.format("Warrior\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Warrior";
    }
}