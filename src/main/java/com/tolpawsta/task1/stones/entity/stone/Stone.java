package com.tolpawsta.task1.stones.entity.stone;

public abstract class Stone {

    private final double weight;
    private final double price;
    private final int opacity;

    public Stone(double weight, double price, int opacity) {
        this.weight = weight;
        this.price = price;
        this.opacity = opacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getOpacity() {
        return opacity;
    }

//TODO I need everride toString if this override in extend class?
    @Override
    public String toString() {
        return "Stone{" +
                "weight=" + weight +
                ", price=" + price +
                ", opacity=" + opacity +
                '}';
    }
}
