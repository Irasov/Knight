package com.epam.irasov.knight.reporter;


import com.epam.irasov.knight.entity.Knight;
import com.epam.irasov.knight.logic.SearchByPrice;

public class Report {
    private SearchByPrice search = new SearchByPrice();

    public void reportKnight(Knight knight){
        System.out.println(knight.toString());
    }

    public void reportSumPrice(Knight knight){
        System.out.println( "Sum gold: "+knight.calculatePrice());
    }

    public void reportSearch(Knight knight){
        System.out.println(search.searchPrice(knight));
    }
}
