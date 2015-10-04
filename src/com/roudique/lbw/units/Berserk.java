package com.roudique.lbw.units;

/*
*   Physical unit that cannot accept any magic influence
*   Versions:
*       v1 standard
*/
public class Berserk extends Unit {
    private static final int BERSERK_MAX_HP = 80;
    private static final int DEFAULT_BERSERK_DAMAGE = 34;
    
    public Berserk() {
        this.maxHitPoints = BERSERK_MAX_HP;
        this.hitPoints = BERSERK_MAX_HP;
        this.damage = DEFAULT_BERSERK_DAMAGE;
    }
    
    @Override
    public void addHitPoints(int HP) throws NoHitPointsException {
        return;
    }
    
    @Override
    public void addMaxHitPoints(int HP) throws NoHitPointsException {
        return;
    }
    
    @Override
    public void setDamage(int dmg) throws NoHitPointsException {
        return;
    }
    
    @Override
    public void acceptDamage(int damage, DamageType type) {
        if ( type == Unit.DamageType.MAGICAL )
            return;
        super.acceptDamage(damage, Unit.DamageType.PHYSICAL);
    }
    
    @Override
    public String toString() {
        return String.format("Berserk\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Berserk";
    }
}