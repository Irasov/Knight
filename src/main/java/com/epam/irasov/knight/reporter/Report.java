package com.epam.irasov.knight.reporter;


import com.epam.irasov.knight.entity.Ammunition;
import com.epam.irasov.knight.entity.Knight;

import java.util.ArrayList;
import java.util.List;

public class Report {

    public static void report(Knight knight){
        System.out.println(knight.toString());
    }

    public static void report(List<Ammunition> a){
        StringBuilder sb = new StringBuilder();
        sb.append("ammunition elements from the range: \n");
        for(Ammunition element:a){
            sb.append(element.toString()+"\n");
        }
        System.out.println(sb);
    }

}
