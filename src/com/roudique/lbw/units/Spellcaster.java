package com.roudique.lbw.units;

import com.roudique.lbw.utils.Spells;

public abstract class Spellcaster extends Unit {
    protected final static int DEFAULT_MAGE_MAX_HP = 65;
    protected final static int DEFAULT_MAGE_ATTACK = 11;
    protected final static int DEFAULT_MAGE_MP = 21;
    protected int maxManaPoints;
    protected int manaPoints;
    
    public int getManaPoints() {
        return manaPoints;
    }
    public void setManaPoints(int mp) {
        manaPoints = mp;
    }
    public int getMaxManaPoints() {
        return maxManaPoints;
    }
    public void setMaxManaPoints(int mp) {
        maxManaPoints = mp;
    }
    
    protected void consumeManaPoints(int value) throws NoManaPointsException {
        if ( value > manaPoints ) {
            throw new NoManaPointsException();
        }
        manaPoints -= value;
    }
    
    public abstract void castHeal(Unit target) throws NoManaPointsException, NoHitPointsException;
    public abstract void castFireball(Unit target) throws NoManaPointsException;
}
