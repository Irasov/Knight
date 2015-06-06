package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.*;
import com.epam.irasov.knight.entity.Knight;

import java.util.ArrayList;

public class SearchByPrice {
    private int min= 1000;
    private int max= 2200;
    private Knight knight;

    public String searchPrice(Knight knight){
        String str="Ammunition in the price band reception from 1000 to 2200:\n";
        ArrayList<Ammunition> elementList = knight.getAmmunitionList();
        for(Ammunition element: elementList){
            if (element.getPrice()>=this.min && element.getPrice()<=this.max){
                str+=" name: "+element.getName()+" | type: "+element.getType()+" | price: " + element.getPrice()+"\n";
            }
        }
        return str;
    }
}
