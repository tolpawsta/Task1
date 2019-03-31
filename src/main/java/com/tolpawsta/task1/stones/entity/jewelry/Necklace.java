package com.tolpawsta.task1.stones.entity.jewelry;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.stone.Stone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Necklace {

    private List<Stone> stoneList;
    private Collet collet;



    public Necklace(List<Stone> stoneList, Collet collet) {

        this.stoneList = stoneList;
        this.collet = collet;
    }

    public List<Stone> getStoneList() {
        return stoneList;
    }

    public Collet getCollet() {
        return collet;
    }

    public void setCollet(Collet collet) {
        this.collet = collet;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for (Stone stone:stoneList) {
            stringBuilder.append("\n\t"+stone.toString());
        }

        return "\nNecklace:" +
                "\n\tstoneList:" + stringBuilder.toString() +
                ", \n\tcollet:" + collet +
                '}';
    }
}
