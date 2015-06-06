package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.*;
import com.epam.irasov.knight.entity.Knight;

import java.util.ArrayList;

public class SearchByPrice {
    private Knight knight;
    private ArrayList<Ammunition> selectedAmmunition = new ArrayList<Ammunition>();
    int min;
    int max;

    public ArrayList<Ammunition> searchPrice(Knight knight, int min, int max){
        ArrayList<Ammunition> ammunitions = knight.getAmmunitionList();
        for(Ammunition ammunition: ammunitions){
            if (ammunition.getPrice()>=min && ammunition.getPrice()<=max){
                selectedAmmunition.add(ammunition);
            }
        }
        return selectedAmmunition;
    }
}

