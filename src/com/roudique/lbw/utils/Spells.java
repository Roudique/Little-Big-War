package com.roudique.lbw.utils;

import com.roudique.lbw.units.*;

/*
*   Utility class for spellcasters (v3)
*   Versions:
*       v1 standart
*       v2 added summonDemon (warlock's spell)
*       v3 new damage system (magical\physical)
*/
public class Spells {
    private static final int FIREBALL_DAMAGE = 48;
    private static final int HEAL = 56;
    public static final int FIREBALL_MANACOST = 8;
    public static final int HEAL_MANACOST = 5;
    public static final int BUFF_MANACOST = 12;
    public static final int DEBUFF_MANACOST = 8;
    public static final int DEMON_MANACOST = 15;
    
    public static void fireBall(Unit target) {
        target.acceptDamage(FIREBALL_DAMAGE, Unit.DamageType.MAGICAL);
    }
    public static void badFireBall(Unit target) {
        target.acceptDamage(FIREBALL_DAMAGE / 2, Unit.DamageType.MAGICAL);
    }
    public static void holyFireBall(Undead target) {
        target.acceptHolyDamage(FIREBALL_DAMAGE / 2);
    }
    public static void heal(Unit target) throws NoHitPointsException {
        target.addHitPoints(HEAL);
    }
    public static void badHeal(Unit target) throws NoHitPointsException {
        target.addHitPoints(HEAL / 2);
    }
    public static void buff(Unit target) throws NoHitPointsException {
        int newDamage = target.getDamage() / 2 + target.getDamage();
        target.setDamage(newDamage);
    }
    public static void debuff(Unit target) throws NoHitPointsException {
        int newDamage = target.getDamage() / 2;
        target.setDamage(newDamage);
    }
    public static void summonDemon(Warlock summoner) throws DemonAlreadyExistsException {
        if ( summoner.demon == null ) {
            Demon summonedDmn = new Demon(summoner);
            summoner.demon = summonedDmn;
        } else {
            throw new DemonAlreadyExistsException();
        }
    }
    /*
    TODO:
        spells:
            manaDrain, manaGain, strengthenAttack, strengthenHP
    */
}

