package com.epam.irasov.knight.entity;

public abstract class Weapon extends Ammunition {
    private String captured;

    public Weapon(){

    }

    public Weapon(String name, String type, int weight, int price, String captured){
        super(name,type,weight,price);
        this.captured=captured;
    }

    public void setCaptured(String captured) {
        this.captured = captured;
    }

    public String getCaptured(){
        return captured;
    }

    @Override
    public String toString(){
        return super.toString()+" | captured: "+captured;
    }
}
