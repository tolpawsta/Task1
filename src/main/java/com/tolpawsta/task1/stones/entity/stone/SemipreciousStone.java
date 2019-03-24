package com.tolpawsta.task1.stones.entity.stone;

import com.tolpawsta.task1.stones.enums.SemipreciousStoneType;

public class SemipreciousStone extends Stone {
    private SemipreciousStoneType name;



    public SemipreciousStone(double weight, double price, int opacity, SemipreciousStoneType name) {
        super(weight, price, opacity);
        this.name = name;
    }

    public SemipreciousStoneType getName() {
        return name;
    }

    public void setName(SemipreciousStoneType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "    SemipreciousStone{" +
                "name=" + name +
                ", weight=" + String.format("%2.2f",this.getWeight()) +
                ", price=" + String.format("%2.2f",this.getPrice()) +
                ", opacity=" + this.getOpacity() +
                '}';
    }
}
