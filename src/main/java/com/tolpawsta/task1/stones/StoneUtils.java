package com.tolpawsta.task1.stones;

import com.tolpawsta.task1.stones.StoneException;

public class StoneUtils {

    private StoneUtils() {
    }

    public static void validateStone(double weight, double price, int opacity) throws StoneException {
        if (weight < 0) {
            throw new StoneException("weight error");
        }
        if (price<0){
            throw new StoneException("price error");
        }
        if (opacity <0 || opacity>100){
            throw new StoneException("opacity error");
        }
    }

}
