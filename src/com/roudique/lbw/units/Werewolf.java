package com.roudique.lbw.units;

/*
*   Physical unit that can transform to wolf
*   Versions:
*       v1 standard
*/
public class Werewolf extends Unit {
    private static final int WEREWOLF_MAX_HP = 100;
    private static final int WOLF_MAX_HP = 135;
    private static final int DEFAULT_WEREWOLF_DAMAGE = 25;
    private static final int DEFAULT_WOLF_DAMAGE = 38;
    private static final double MAGIC_VULNERABILITY = 1.75;
    private boolean wolfForm;
    
    public Werewolf() {
        this.maxHitPoints = WEREWOLF_MAX_HP;
        this.hitPoints = WEREWOLF_MAX_HP;
        this.damage = DEFAULT_WEREWOLF_DAMAGE;
        this.wolfForm = false;
    }
    
    public void transform() {
        if ( wolfForm == false ) {
            transformToWolf();
            wolfForm = true;
        } else {
            transformToHuman();
        }
    }
    
    @Override
    public void acceptDamage(int damage, DamageType type) {
        if ( type == Unit.DamageType.MAGICAL && wolfForm == true ) {
            Double newDamage = (double)damage * MAGIC_VULNERABILITY;
            damage = newDamage.intValue();
        }
        super.acceptDamage(damage, Unit.DamageType.PHYSICAL);
    }
    
    private void transformToWolf() {
        double hitPointsPercent = (double)hitPoints / (double)maxHitPoints;
        Double newHitPointsDouble = WOLF_MAX_HP * hitPointsPercent;
        
        this.hitPoints = newHitPointsDouble.intValue();
        this.maxHitPoints = WOLF_MAX_HP;
        this.damage = DEFAULT_WOLF_DAMAGE;
    }
    private void transformToHuman() {
        double hitPointsPercent = (double)hitPoints / (double)maxHitPoints;
        Double newHitPointsDouble = WEREWOLF_MAX_HP * hitPointsPercent;
        
        this.hitPoints = newHitPointsDouble.intValue();
        this.maxHitPoints = WEREWOLF_MAX_HP;
        this.damage = DEFAULT_WEREWOLF_DAMAGE;
    }
    
    @Override
    public String toString() {
        return String.format("Werewolf\'s id is: %s\n---Hit Points: %s/%s\n---Damage: %s\n",
                                id,
                                hitPoints, maxHitPoints,
                                damage);
    }
    
    @Override
    public String getName() {
        return "Werewolf";
    }
}