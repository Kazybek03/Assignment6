package com.company.FactoryMethod;

public class SeaLogistics implements Logistics{
    @Override

    public void manage(){
        System.out.println("controlling ships...");
    }
}