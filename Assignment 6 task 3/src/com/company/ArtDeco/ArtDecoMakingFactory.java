package com.company.ArtDeco;

import com.company.Chair;
import com.company.Table;
import com.company.Teams;
import com.company.Sofa;
public class ArtDecoMakingFactory implements Teams {
    @Override
    public Chair getChair(){
        return new ArtDecoChair();
    }
    @Override
    public Table getTable(){
        return new ArtDecoTable();
    }
    @Override
    public Sofa getSofa(){
        return new ArtDecoSofa();
    }
}
