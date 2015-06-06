package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.*;
import com.epam.irasov.knight.entity.Knight;

import java.util.ArrayList;
import java.util.List;

public class SearchByPrice {
    private Knight knight;
    private List<Ammunition> selectedAmmunition = new ArrayList<Ammunition>();
    int min;
    int max;

    public List<Ammunition> searchPrice(Knight knight, int min, int max){
        List<Ammunition> ammunitions = knight.getAmmunitionList();
        for(Ammunition ammunition: ammunitions){
            if (ammunition.getPrice()>=min && ammunition.getPrice()<=max){
                selectedAmmunition.add(ammunition);
            }
        }
        return selectedAmmunition;
    }
}

