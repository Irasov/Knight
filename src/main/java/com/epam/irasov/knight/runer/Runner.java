package com.epam.irasov.knight.runer;

import com.epam.irasov.knight.creator.Creator;
import com.epam.irasov.knight.entity.Ammunition;
import com.epam.irasov.knight.entity.Knight;
import com.epam.irasov.knight.logic.Sort;
import com.epam.irasov.knight.reporter.Report;

import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Report report = new Report();
        Knight knight = new Knight("Don Quixote");
        Creator creator = new Creator(knight,7);
        Sort sort = new Sort();
        creator.CreateAmmunition();
        sort.sortAmmunition(knight,"weight");
        report.reportKnight(knight);
        report.reportSumPrice(knight);
        report.reportSearch(knight,500,1500);
    }
}
