package com.epam.irasov.knight.creator;



import com.epam.irasov.knight.entity.*;

import java.util.Random;

public class Creator {
    public enum ConstAmmunition {ARMOR,RANGED_WEAPON,MELLE_WEAPON,HELMET,SHIELD};
    public enum ArmorType {ARMOR, CHAIN_ARMOR};
    public enum ConstProtection {FULLY,BREAST,CHEST_AND_BACK,CHEST_AND_ARMS,CHEST_AND_LEGS};
    public enum ConstCaptured {CAPTURED,NOT_CAPTURED};
    public enum MelleWeaponType {SWORD,DAGER,MACE,SPEAR};
    public enum RangedWeaponType {BOW,CROSS_BOW,JAVELIN};
    public enum ShieldType {CROWS,NORMAN,BUCKLER,TORCH,PAVESE};
    public enum ShieldMaterial {METAL,TREE};
    public enum HelmetType {NORMAN,DORIE,DEAF};
    public enum ConstBalaclava {THERE_BALACLAVA,NO_BALACLAVA};
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

    private ArmorType randomArmorType(){
        ArmorType[] values = ArmorType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private ConstProtection randomConstProtection(){
        ConstProtection[] values = ConstProtection.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private ConstCaptured randomCaptured() {
        ConstCaptured[] values = ConstCaptured.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private MelleWeaponType randomMelleWeapon(){
        MelleWeaponType[] values = MelleWeaponType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private RangedWeaponType randomRangedWeapon(){
        RangedWeaponType[] values = RangedWeaponType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private ShieldType randomShieldType(){
        ShieldType[] values = ShieldType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private ShieldMaterial randomShieldMaterial(){
        ShieldMaterial[] values = ShieldMaterial.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private HelmetType randomHelmetType(){
        HelmetType[] values = HelmetType.values();
        return values[RANDOM.nextInt(values.length)];
    }

    private ConstBalaclava randomConstBalaclava (){
        ConstBalaclava[] values = ConstBalaclava.values();
        return values[RANDOM.nextInt(values.length)];
    }

    public void CreateAmmunition() {
        Ammunition componentAmmunition = null;
        for(int i=1; i<=this.countAmmunition;i++) {
            ConstAmmunition[] values = ConstAmmunition.values();
            String randName= String.valueOf(values[RANDOM.nextInt(values.length)]);
            if (randName=="ARMOR") {
                int randWeight = (RANDOM.nextInt(ARMOR_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_ARMOR) + ADDITIVE_PRICE);
                componentAmmunition = new Armor(randName, String.valueOf(randomArmorType()), randWeight, randPrice,String.valueOf(randomConstProtection()));
                knight.addAmmunition(componentAmmunition);
            }
            if (randName=="HELMET") {
                int randWeight = (RANDOM.nextInt(HELMET_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_HELMET) + ADDITIVE_PRICE);
                componentAmmunition = new Helmet(randName, String.valueOf(randomHelmetType()), randWeight, randPrice, String.valueOf(randomConstBalaclava()));
                knight.addAmmunition(componentAmmunition);
            }
            if (randName=="SHIELD") {
                int randWeight = (RANDOM.nextInt(SHIELD_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_SHIELD) + ADDITIVE_PRICE);
                componentAmmunition = new Shield(randName, String.valueOf(randomShieldType()), randWeight, randPrice, String.valueOf(randomShieldMaterial()));
                knight.addAmmunition(componentAmmunition);
            }
            if (randName=="MELLE_WEAPON") {
                int randWeight = (RANDOM.nextInt(WEAPON_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_WEAPON) + ADDITIVE_PRICE);
                int randomLengthWeapon = (RANDOM.nextInt(LENGTH_WEAPON) + ADDITIVE_NOT_RANDOM_ZERO);
                componentAmmunition = new MelleWeapon(randName, String.valueOf(randomMelleWeapon()), randWeight, randPrice, String.valueOf(randomCaptured()), randomLengthWeapon);
                knight.addAmmunition(componentAmmunition);
            }
            if (randName=="RANGED_WEAPON") {
                int randWeight = (RANDOM.nextInt(WEAPON_WEIGHT) + ADDITIVE_NOT_RANDOM_ZERO);
                int randPrice = (RANDOM.nextInt(PRICE_WEAPON) + ADDITIVE_PRICE);
                int randomNumberOfShells = (RANDOM.nextInt(SHELLS) + ADDITIVE_NOT_RANDOM_ZERO);
                componentAmmunition = new RangedWeapon(randName, String.valueOf(randomRangedWeapon()), randWeight, randPrice, String.valueOf(randomCaptured()), randomNumberOfShells);
                knight.addAmmunition(componentAmmunition);
            }
        }
    }
}






