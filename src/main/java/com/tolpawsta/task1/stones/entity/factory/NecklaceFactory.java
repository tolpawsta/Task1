package com.tolpawsta.task1.stones.entity.factory;

import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.Stone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NecklaceFactory {
    public static Necklace createNecklace() {
        List<Stone> stoneList = new ArrayList<Stone>();
        Random random = new Random();
        for (int i = 1; i <= random.nextInt(6) + 2; i++) {
            stoneList.add(StoneFactory.createStone());
        }
        return new Necklace(stoneList,ColletFactory.creatCollet());
    }
}
