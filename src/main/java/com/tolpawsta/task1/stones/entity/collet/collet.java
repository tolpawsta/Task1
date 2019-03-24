package com.tolpawsta.task1.stones.entity.collet;

import com.tolpawsta.task1.stones.enums.ColletMaterilType;

public class Collet {

    private ColletMaterilType material;

    public Collet(){

    }
    public Collet(ColletMaterilType material){
        this.material=material;
    }
    public ColletMaterilType getMaterial() {
        return material;
    }

    public void setMaterial(ColletMaterilType material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "    collet{" +
                "material=" + material +
                '}';
    }
}
