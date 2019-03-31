package com.tolpawsta.task1.stones.entity.stone;

public enum SemipreciousStoneType {
   AQUAMARINE, AMETHYST, MALACHIT, AMBER, OPAL;

   public static SemipreciousStoneType find(String name) {
      for (SemipreciousStoneType type : SemipreciousStoneType.values()) {
         if (type.name().equals(name)) {
            return type;
         }
      }
      return null;
   }
}
