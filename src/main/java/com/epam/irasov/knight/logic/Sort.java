package com.epam.irasov.knight.logic;

import com.epam.irasov.knight.entity.Ammunition;
import com.epam.irasov.knight.entity.Knight;

import java.util.Collections;

public class Sort {
    public void sortAmmunition(Knight knight,String variant){
        if(variant=="weight"){
            Ammunition.WeightComparator weightsort = new Ammunition.WeightComparator();
            Collections.sort(knight.getAmmunitionList(), weightsort);
        }
        if(variant=="price"){
            Ammunition.PriceComparator pricesort = new Ammunition.PriceComparator();
            Collections.sort(knight.getAmmunitionList(), pricesort);
        }
        if(variant=="name"){
            Ammunition.NameComparator namesort = new Ammunition.NameComparator();
            Collections.sort(knight.getAmmunitionList(), namesort);
        }
    }
}
