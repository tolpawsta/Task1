package com.tolpawsta.task1.stones.entity.collet;

public enum ColletMaterialType {
    GOLD, SILVER, PLATINUM;
    public static ColletMaterialType find(String name){
        for (ColletMaterialType type:ColletMaterialType.values()) {
            if (type.name().equals(name)){
                return type;
            }
        }
        return null;
    }
}
