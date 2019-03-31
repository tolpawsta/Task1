package com.tolpawsta.task1.stones.entity.stone;

public enum PreciousStoneType {
    DIAMOND, EMERALD, RUBY, SAPPHIRE, PERL;

    public static PreciousStoneType find(String name) {
        for (PreciousStoneType type : PreciousStoneType.values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return null;
    }
}
