package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.collet.ColletMaterialType;
import com.tolpawsta.task1.stones.ColletException;
import java.util.Random;

public class ColletFactory {

    /**
     * Create collect
     * @return collet instance
     */
    public static Collet createCollet(String name) throws ColletException{
        if (ColletMaterialType.find(name)!=null) {
            return new Collet(ColletMaterialType.valueOf(name));
        }else throw new ColletException("Can not find collet with name"+name);
    }
}
