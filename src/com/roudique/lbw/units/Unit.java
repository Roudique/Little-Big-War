package com.roudique.lbw.units;

public abstract class Unit implements Observable
{
    public enum DamageType {
        PHYSICAL, MAGICAL
    }
    
    public static int totalUnits = 0;
    protected int id = totalUnits++;
    protected int maxHitPoints;
    protected int hitPoints;
    protected int damage;
    protected Observer observer;
    
    public boolean isAlive() {
        if ( hitPoints > 0 ) 
            return true;
        return false;
    }
    public int getMaxHitPoints() {
        return maxHitPoints;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public int getDamage() {
        return damage;
    }
    public int getId() {
        return id;
    }
    public Observer getObserver() {
        return observer;
    }
    
    public void addHitPoints(int HP) throws NoHitPointsException {
        if ( isAlive() ) {
            if ( this.hitPoints + HP > maxHitPoints ) {
                hitPoints = maxHitPoints;
            } else {
                hitPoints += HP;
            }
        } else {
            throw new NoHitPointsException();
        }
    }
    public void addMaxHitPoints(int HP) throws NoHitPointsException {
        maxHitPoints += HP;
        addHitPoints(HP);
    }
    public void setDamage(int dmg) throws NoHitPointsException {
        if ( isAlive() ) {
            this.damage = dmg;
        } else {
            throw new NoHitPointsException();
        }
    }
    public void setObserver(Observer target) {
        this.observer = target;
    }
    
    public void die() {
        this.hitPoints = 0;
        if ( observer != null ) {
            observer.consumeSoul(this);
        }
    }
    
    protected void doDamage(Unit target) {
        target.acceptDamage(this.damage, DamageType.PHYSICAL);
    }
    protected void counterAttack(Unit target) {
        if ( target instanceof Rogue )
            return;
        target.acceptDamage(this.damage / 2, DamageType.PHYSICAL);
    }
    public void acceptDamage(int damage, DamageType type) {
        if ( damage >= this.hitPoints ) {
            this.die();
            return;
        }
        
        this.hitPoints -= damage;
    }
    
    public void attack(Unit target) throws NoHitPointsException {
        if ( this.isAlive() ) {
            this.doDamage(target);
            if ( target.isAlive() )
                target.counterAttack(this);
        } else {
            throw new NoHitPointsException();
        }
    }
    
    abstract public String getName();
}

