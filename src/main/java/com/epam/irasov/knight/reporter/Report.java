package com.epam.irasov.knight.reporter;


import com.epam.irasov.knight.entity.Ammunition;
import com.epam.irasov.knight.entity.Knight;
import com.epam.irasov.knight.logic.SearchByPrice;

import java.util.ArrayList;

public class Report {
    private SearchByPrice search = new SearchByPrice();

    public void reportKnight(Knight knight){
        System.out.println(knight.toString());
    }

    public void reportSumPrice(Knight knight){
        System.out.println( "Sum gold: "+knight.calculatePrice());
    }

    public void reportSearch(Knight knight,int min,int max){
        ArrayList<Ammunition> selectedAmmunition= search.searchPrice(knight, min, max);
        String str="Ammunition in the price band reception from "+min+" to "+max+":\n";
        for(Ammunition ammunition:selectedAmmunition){
            str+=ammunition.toString()+"\n";
        }
        System.out.println(str);
    }
}
