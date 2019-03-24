package com.tolpawsta.task1.stones.entity.stone;

import java.util.Random;

public abstract class Stone {
    private double weight;
    private double price;
    private int opacity;

    public Stone(double weight, double price, int opacity) {
        setWeight(weight);
        setPrice(price);
        setOpacity(opacity);
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if(weight>0) this.weight = weight;
        else this.weight=Math.abs(new Random().nextDouble());
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price>0) this.price = price;
        else this.price=Math.abs(new Random().nextDouble());
    }

    public int getOpacity() {
        return opacity;
    }

    private void setOpacity(int opacity) {
        if (opacity>=0 && opacity<=100)
            this.opacity=opacity;
        else this.opacity=new Random().nextInt(50)+12;
    }



    @Override
    public String toString() {
        return "Stone{" +
                "weight=" + weight +
                ", price=" + price +
                ", opacity=" + opacity +
                '}';
    }
}
