package com.company.FactoryMethod;

public class SeaLogisticsFactory implements LogisticsFactory{
    @Override
    public Logistics createMachine(){
        return new SeaLogistics();
    }
}
