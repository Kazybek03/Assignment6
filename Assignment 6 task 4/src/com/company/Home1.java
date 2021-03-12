package com.company;

public class Home1 implements Builder{
    @Override
    public int getWindow(){
        return 3;
    }
    @Override
    public String getDoor(){
        return "made from wood";
    }
    @Override
    public int numberRooms(){
        return 2;
    }
    @Override
    public String specialThing(){
        return "many trees around";
    }
}
