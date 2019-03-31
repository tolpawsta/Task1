package com.tolpawsta.task1.stones.entity.collet;

/**
 *
 */
public class Collet {

    private ColletMaterialType material;

    public Collet() {
    }

    public Collet(ColletMaterialType material) {
        super();
        this.material = material;
    }

    public ColletMaterialType getMaterial() {
        return material;
    }

    public void setMaterial(ColletMaterialType material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "    collet{" +
                "material=" + material +
                '}';
    }
}
