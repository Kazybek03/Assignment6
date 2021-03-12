package com.company.ArtDeco;

import com.company.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void design(){
        System.out.println("made from leather");
    }
}

