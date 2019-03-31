package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.StoneException;
import com.tolpawsta.task1.stones.StoneUtils;
import com.tolpawsta.task1.stones.entity.stone.PreciousStone;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStone;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import com.tolpawsta.task1.stones.entity.stone.PreciousStoneType;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStoneType;

/**
 * Use public in class
 */
public class StoneFactory {

    public static Stone createStone(double weight, double price, int opacity, String name) throws StoneException {
        if (PreciousStoneType.find(name) != null) {

            StoneUtils.validateStone(weight, price, opacity);

            return new PreciousStone(weight, price, opacity, PreciousStoneType.valueOf(name));
        } else if (SemipreciousStoneType.find(name) != null) {

            StoneUtils.validateStone(weight, price, opacity);

            return new SemipreciousStone(weight, price, opacity, SemipreciousStoneType.valueOf(name));
        } else {
            throw new StoneException("Con not find stone with name " + name);
        }
    }

}
