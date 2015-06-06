package com.epam.irasov.knight.entity;

import java.util.ArrayList;
import java.util.List;

public class Knight {
    private String nameKnight;
    private List<Ammunition> ammunitionList;

    public Knight(String nameKnight){
        this.nameKnight=nameKnight;
        ammunitionList = new ArrayList<Ammunition>();
    }

    public void setNameKnight(String nameKnight){
        this.nameKnight=nameKnight;
    }

    public String getNameKnight(){
        return nameKnight;
    }

    public void setAmmunitionList(ArrayList<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    public List<Ammunition> getAmmunitionList(){
        return ammunitionList;
    }

    public void addAmmunition(Ammunition ammunitionTo){
        this.ammunitionList.add(ammunitionTo);
    }

    public int calculatePrice(){
        int sumPrice = 0;
        for(Ammunition elementAmmunition: this.ammunitionList){
           sumPrice += elementAmmunition.getPrice();
        }
        return sumPrice;
    }

    @Override
    public String toString(){
        String str=" Name knight: "+nameKnight+"\n"+"Ammunition:\n";
        for(Ammunition element:ammunitionList){
            str+=element.toString()+"\n";
        }
        return str;
    }
}
