package com.tolpawsta.task1.stones.entity.stone;

import com.tolpawsta.task1.stones.enums.PreciousStoneType;

public class PreciousStone extends Stone {

    private PreciousStoneType name;


    public PreciousStone(double weight, double price, int opacity,PreciousStoneType name) {
        super(weight, price, opacity);
        this.name=name;
    }

    public PreciousStoneType getName() {
        return name;
    }

    public void setName(PreciousStoneType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "    PreciousStone{" +
                "name=" + name +
                ", weight=" + String.format("%2.2f",this.getWeight()) +
                ", price=" + String.format("%2.2f",this.getPrice()) +
                ", opacity=" +this.getOpacity() +

                '}';
    }
}
