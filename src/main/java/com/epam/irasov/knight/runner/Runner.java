package com.epam.irasov.knight.runner;

import com.epam.irasov.knight.creator.Creator;
import com.epam.irasov.knight.entity.Knight;
import com.epam.irasov.knight.logic.Action;
import com.epam.irasov.knight.reporter.Report;

public class Runner {
    public static final String CUSTOM_NAME_KNIGHT = "Don Quixote";
    public static final String CUSTOM_SORT_CRITERION = "weight";
    public static final int CUSTOM_AMOUNT_AMMUNITION = 7;
    public static final int CUSTOM_MIN_PRICE = 500;
    public static final int CUSTOM_MAX_PRICE = 1500;

    public static void main(String[] args) {
        Knight knight = new Knight(CUSTOM_NAME_KNIGHT);
        Creator creator = new Creator(knight, CUSTOM_AMOUNT_AMMUNITION);
        creator.CreateAmmunition();
        Action.sortAmmunition(knight.getAmmunitionList(), CUSTOM_SORT_CRITERION);
        Report.report(knight);
        Report.report(Action.searchPrice(knight.getAmmunitionList(),CUSTOM_MIN_PRICE,CUSTOM_MAX_PRICE));
    }
}
