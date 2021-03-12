package com.company.FactoryMethod;

public class Application {
    public static void main(String[] args) {
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

//        LogisticsFactory logisticsFactory2
//                = LogisticsFactory.createMachineBySpeciality("sea");
    }
}
