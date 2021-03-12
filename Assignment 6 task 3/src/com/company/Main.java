package com.company;

import com.company.ArtDeco.ArtDecoMakingFactory;
import com.company.Victorian.VictorianMakingCompany;

public class Main {

    public static void main(String[] args) {
        System.out.println("Art Deco designed furniture");
        Teams factories = new ArtDecoMakingFactory();
        Chair chair = factories.getChair();
        Sofa sofa = factories.getSofa();
        Table table = factories.getTable();

        chair.design();
        sofa.design();
        table.design();

        System.out.println("Victorian designed furniture");
        Teams factories2 = new VictorianMakingCompany();

        Chair chair2 = factories2.getChair();
        Sofa sofa2 = factories2.getSofa();
        Table table2 = factories2.getTable();

        chair2.design();
        sofa2.design();
        table2.design();
    }
}

