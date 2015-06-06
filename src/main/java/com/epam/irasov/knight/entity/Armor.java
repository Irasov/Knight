package com.epam.irasov.knight.entity;

public class Armor extends Ammunition {

    private String protection;

    public Armor(){

    }

    public Armor(String name,String type,int weight,int price,String protection){
        super(name,type,weight,price);
        this.protection=protection;
    }

    public void setProtection(String protection){
        this.protection = protection;
    }

    public String getProtection() {
        return protection;
    }

    @Override
    public String toString(){
        return super.toString()+" | protection: "+protection;
    }
}
