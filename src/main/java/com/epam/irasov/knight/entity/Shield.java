package com.epam.irasov.knight.entity;

public class Shield extends Ammunition {

    private String material;

    public Shield(){

    }

    public Shield(String name,String type,int weight,int price,String material){
        super(name,type,weight,price);
        this.material=material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString(){
        return super.toString()+" | material: "+material;
    }
}
