package com.epam.irasov.knight.runer;

import com.epam.irasov.knight.creator.Creator;
import com.epam.irasov.knight.entity.Ammunition;
import com.epam.irasov.knight.entity.Knight;
import com.epam.irasov.knight.logic.Action;
import com.epam.irasov.knight.reporter.Report;

import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Knight knight = new Knight("Don Quixote");
        Creator creator = new Creator(knight, 7);
        creator.CreateAmmunition();
        Action.sortAmmunition(knight.getAmmunitionList(), "weight");
        Report.report(knight);
        Report.report(Action.searchPrice(knight.getAmmunitionList(),500,1500));
    }
}
