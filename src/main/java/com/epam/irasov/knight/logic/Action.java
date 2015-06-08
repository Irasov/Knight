package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.Ammunition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {
    public static void sortAmmunition(List<Ammunition> a,String variant){
        if(variant=="weight"){
            Collections.sort(a,new Ammunition.WeightComparator());
        }
        if(variant=="price"){
            Collections.sort(a, new Ammunition.PriceComparator());
        }
        if(variant=="name"){
            Collections.sort(a, new Ammunition.NameComparator());
        }
    }

    public static List<Ammunition> searchPrice(List<Ammunition> a, int min, int max){
        List<Ammunition> selectedAmmunition = new ArrayList<Ammunition>();
        for(Ammunition ammunition: a){
            if (ammunition.getPrice()>=min && ammunition.getPrice()<=max){
                selectedAmmunition.add(ammunition);
            }
        }
        return selectedAmmunition;
    }
}
