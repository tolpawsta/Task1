package com.tolpawsta.task1.stones.entity.factory;

import com.tolpawsta.task1.stones.entity.stone.PreciousStone;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStone;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import com.tolpawsta.task1.stones.enums.PreciousStoneType;
import com.tolpawsta.task1.stones.enums.SemipreciousStoneType;

import java.util.Random;

 class StoneFactory {
     static Stone createStone(){
        Random random =new Random();
        switch (random.nextInt(2)){
            case 0:
                return new PreciousStone(
                        new Random().nextDouble()*10*0.1,
                        new Random().nextDouble()*1000,
                        new Random().nextInt(100),
                        PreciousStoneType.values()[random.nextInt(PreciousStoneType.values().length)]
                );
            case 1:
                    return new SemipreciousStone(
                      new Random().nextDouble()*10*0.1,
                      new Random().nextDouble()*500,
                      new Random().nextInt(100),
                            SemipreciousStoneType.values()[random.nextInt(SemipreciousStoneType.values().length)]
                    );

                    default:return null;
        }
    }
}
