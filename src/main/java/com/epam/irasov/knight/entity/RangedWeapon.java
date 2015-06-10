package com.epam.irasov.knight.entity;

public class RangedWeapon extends Weapon {
    public enum RangedWeaponType {BOW,CROSS_BOW,JAVELIN};
    private int numberOfShells;
    private RangedWeapon type;

    public RangedWeapon(){

    }

    public RangedWeapon(ConstAmmunition name,RangedWeapon type,int weight,int price,Captured captured,int numberOfShells){
        super(name,weight,price,captured);
        this.numberOfShells=numberOfShells;
        this.type = type;
    }

    public void setType(RangedWeapon type){
        this.type = type;
    }

    public RangedWeapon getType(){
        return this.type;
    }

    public void setNumberOfShells(int numberOfShells) {
        this.numberOfShells = numberOfShells;
    }

    public int getNumberOfShells() {
        return numberOfShells;
    }

    @Override
    public String toString(){
        return super.toString()+" | type: "+type+" | number of shells: "+numberOfShells;
    }
}
