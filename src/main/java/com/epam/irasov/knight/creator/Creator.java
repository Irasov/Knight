package com.epam.irasov.knight.creator;



import com.epam.irasov.knight.entity.*;

import java.util.Random;

public class Creator {
    public static final int PRICE_ARMOR = 2500;
    public static final int PRICE_HELMET = 1000;
    public static final int PRICE_SHIELD = 1500;
    public static final int PRICE_WEAPON = 2000;
    public static final int WEAPON_WEIGHT = 5;
    public static final int ARMOR_WEIGHT = 25;
    public static final int HELMET_WEIGHT = 5;
    public static final int SHIELD_WEIGHT = 8;
    public static final int ADDITIVE_NOT_RANDOM_ZERO = 1;
    public static final int ADDITIVE_PRICE = 500;
    public static final int LENGTH_WEAPON = 100;
    public static final int SHELLS = 15;
    public static Random RANDOM = new Random();

    private Knight knight;
    private int countAmmunition;

    public Creator(Knight knight, int countAmmunition){
        this.knight = knight;
        this.countAmmunition=countAmmunition;
    }

    public void setCountAmmunition(int countAmmunition){
        this.countAmmunition=countAmmunition;
    }

    public int getCountAmmunition() {
        return countAmmunition;
    }

    private Armor.ArmorType randomArmorType(){
        Armor.ArmorType[] values = Armor.ArmorType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private Armor.ConstProtection randomConstProtection(){
        Armor.ConstProtection[] values = Armor.ConstProtection.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private  Weapon.Captured randomCaptured() {
        Weapon.Captured [] values =  Weapon.Captured.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private MelleWeapon.MelleWeaponType randomMelleWeapon(){
        MelleWeapon.MelleWeaponType[] values = MelleWeapon.MelleWeaponType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private RangedWeapon.RangedWeaponType randomRangedWeapon(){
        RangedWeapon.RangedWeaponType[] values = RangedWeapon.RangedWeaponType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private Shield.ShieldType randomShieldType(){
        Shield.ShieldType[] values = Shield.ShieldType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private Shield.ShieldMaterial randomShieldMaterial(){
        Shield.ShieldMaterial[] values = Shield.ShieldMaterial.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private Helmet.HelmetType randomHelmetType(){
        Helmet.HelmetType[] values = Helmet.HelmetType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private Helmet.ConstBalaclava randomConstBalaclava (){
        Helmet.ConstBalaclava[] values = Helmet.ConstBalaclava.values();
        return values[RANDOM.nextInt(values.length)];
    }
    private Ammunition.ConstAmmunition randomConstAmmunition (){
        Ammunition.ConstAmmunition[] values = Ammunition.ConstAmmunition.values();
        return values[RANDOM.nextInt(values.length)];
    }


    public void CreateAmmunition() {
        Ammunition componentAmmunition = null;
        for(int i=1; i<=this.countAmmunition;i++) {
            Ammunition.ConstAmmunition randName = randomConstAmmunition ();
            randName = randomConstAmmunition();
            if (randName.equals(Ammunition.ConstAmmunition.ARMOR)) {
                int randWeight = (RANDOM.nextInt(ARMOR_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_ARMOR) + ADDITIVE_PRICE);
                componentAmmunition = new Armor(randName, randomArmorType(), randWeight, randPrice,randomConstProtection());
                knight.addAmmunition(componentAmmunition);
            }
            if (randName.equals(Ammunition.ConstAmmunition.HELMET)) {
                int randWeight = (RANDOM.nextInt(HELMET_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_HELMET) + ADDITIVE_PRICE);
                componentAmmunition = new Helmet(randName, randomHelmetType(), randWeight, randPrice, randomConstBalaclava());
                knight.addAmmunition(componentAmmunition);
            }
            if (randName.equals(Ammunition.ConstAmmunition.SHIELD)) {
                int randWeight = (RANDOM.nextInt(SHIELD_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_SHIELD) + ADDITIVE_PRICE);
                componentAmmunition = new Shield(randName, randomShieldType(), randWeight, randPrice,randomShieldMaterial());
                knight.addAmmunition(componentAmmunition);
            }
            if (randName.equals(Ammunition.ConstAmmunition.MELLE_WEAPON)) {
                int randWeight = (RANDOM.nextInt(WEAPON_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_WEAPON) + ADDITIVE_PRICE);
                int randomLengthWeapon = (RANDOM.nextInt(LENGTH_WEAPON) + ADDITIVE_NOT_RANDOM_ZERO);
                componentAmmunition = new MelleWeapon(randName, randomMelleWeapon(), randWeight, randPrice, randomCaptured(), randomLengthWeapon);
                knight.addAmmunition(componentAmmunition);
            }
            if (randName.equals(Ammunition.ConstAmmunition.RANGED_WEAPON)) {
                int randWeight = (RANDOM.nextInt(WEAPON_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_WEAPON) + ADDITIVE_PRICE);
                int randomNumberOfShells = (RANDOM.nextInt(SHELLS) + ADDITIVE_NOT_RANDOM_ZERO);
                componentAmmunition = new RangedWeapon(randName, randomRangedWeapon(), randWeight, randPrice, randomCaptured(), randomNumberOfShells);
                knight.addAmmunition(componentAmmunition);
            }
        }
    }
}






