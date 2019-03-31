package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.StoneException;
import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.collet.ColletMaterialType;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStone;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStoneType;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import com.tolpawsta.task1.stones.entity.stone.PreciousStoneType;
import org.apache.log4j.Logger;
import com.tolpawsta.task1.stones.ColletException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class NecklaceFactory {

    private static final Logger logger = Logger.getLogger(NecklaceFactory.class);

    /**
     * @return
     */
    public static Necklace generateNecklace() {
        List<Stone> stoneList = new ArrayList<>();
        Collet collet=new Collet();
        for (int i = 1; i <= 10; i++) {

            double weight = new Random().nextDouble() * 10 * 0.1;
            double price = new Random().nextDouble() * 1000;
            int opacity = new Random().nextInt(100);
            String nameStone = "";
            switch (new Random().nextInt(2)) {
                case 0:
                    nameStone = PreciousStoneType.values()[new Random().nextInt(PreciousStoneType.values().length)].name();
                    break;
                case 1:
                    nameStone = SemipreciousStoneType.values()[new Random().nextInt(SemipreciousStoneType.values().length)].name();
                    break;
            }

            try {
                stoneList.add(StoneFactory.createStone(weight, price, opacity, nameStone));
            } catch (StoneException e) {//TODO: Ask for checking Exception
                logger.error(e.getMessage(), e);
            }
        }
        try {
            String nameCollet=ColletMaterialType.values()[new Random().nextInt(ColletMaterialType.values().length)].name();
            collet = ColletFactory.createCollet(nameCollet);

        } catch (ColletException ex){
            logger.error(ex.getMessage(),ex);
        }
        return new Necklace(stoneList,collet );
    }
}
