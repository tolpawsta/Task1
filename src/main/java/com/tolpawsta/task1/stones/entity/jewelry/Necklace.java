package com.tolpawsta.task1.stones.entity.jewelry;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.stone.PreciousStone;
import com.tolpawsta.task1.stones.entity.stone.Stone;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
   private List<Stone> stoneList=new ArrayList<Stone>();
   private Collet collet;

   public Necklace(){

   }
    public Necklace(List<Stone> stoneList, Collet collet) {
        this.stoneList = stoneList;
        this.collet = collet;
    }

    public List<Stone> getStoneList() {
        return stoneList;
    }

    public void setStoneList(List<Stone> stoneList) {
        this.stoneList = stoneList;
    }

    public Collet getCollet() {
        return collet;
    }

    public void setCollet(Collet collet) {
        this.collet = collet;
    }


    public void information(){
       System.out.println("Necklace:");
       System.out.println("  stones:");
        for (Stone stone:stoneList) {
            System.out.println(stone);
        }
        System.out.println("  collet:");
        System.out.println(collet);
    }

}
