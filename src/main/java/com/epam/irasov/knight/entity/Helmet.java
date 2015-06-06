package com.epam.irasov.knight.entity;

public class Helmet extends Ammunition {

    private String balaclava;

    public Helmet(){

    }

    public Helmet(String name,String type,int weight,int price, String balaclava){
        super(name,type,weight,price);
        this.balaclava=balaclava;
    }

    public void setBalaclava(String balaclava) {
        this.balaclava = balaclava;
    }

    public String getBalaclava(){
        return balaclava;
    }

    @Override
    public String toString(){
        return super.toString()+" | balaclava: "+balaclava;
    }
}
