package com.company;

import com.company.FactoryMethod.Logistics;
import com.company.FactoryMethod.LogisticsFactory;
import com.company.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello");
        System.out.println(singleton.returnWord);

        LogisticsFactory logisticsFactory
                = LogisticsFactory.createMachineBySpeciality("road");
        Logistics l = logisticsFactory
                .createMachine();
        Logistics l1 = logisticsFactory
                .createMachine();
        Logistics l2 = logisticsFactory
                .createMachine();

        l.manage();
        l1.manage();
        l2.manage();
    }

}
