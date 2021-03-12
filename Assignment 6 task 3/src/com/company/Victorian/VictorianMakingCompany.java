package com.company.Victorian;

import com.company.Chair;
import com.company.Table;
import com.company.Teams;
import com.company.Sofa;
public class VictorianMakingCompany implements Teams{
    @Override
    public Chair getChair(){
        return new VictorianChair();
    }
    @Override
    public Table getTable(){
        return new VictorianTable();
    }
    @Override
    public Sofa getSofa(){
        return new VictorianSofa();
    }
}
