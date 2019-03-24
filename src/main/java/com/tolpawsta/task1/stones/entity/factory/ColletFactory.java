package com.tolpawsta.task1.stones.entity.factory;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.enums.ColletMaterilType;

import java.util.Random;

 class ColletFactory {
    public static Collet creatCollet(){
        Random random =new Random();
        return new Collet(ColletMaterilType.values()[random.nextInt(ColletMaterilType.values().length)]);
    }
}
