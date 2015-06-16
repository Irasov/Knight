package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.Ammunition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {
    public static void sortAmmunition(List<Ammunition> a,String variant){
        if(variant=="weight"){
            Collections.sort(a,Ammunition.WEIGHT_ORDER);
        }
        if(variant=="price"){
            Collections.sort(a,Ammunition.PRICE_ORDER);
        }
        if(variant=="name"){
            Collections.sort(a,Ammunition.NAME_ORDER);
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
