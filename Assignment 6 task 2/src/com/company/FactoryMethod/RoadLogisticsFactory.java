package com.company.FactoryMethod;

public class RoadLogisticsFactory implements LogisticsFactory{
    @Override
    public Logistics createMachine(){
        return new RoadLogistics();
    }
}

