package com.tolpawsta.task1.stones.entity.jewelry;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.collet.ColletMaterialType;
import com.tolpawsta.task1.stones.entity.stone.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NecklaceTest {

    Collet collet;
    List<Stone> stoneList;
    Necklace necklace;
    @Before
    public void setUp(){
        collet=new Collet(ColletMaterialType.GOLD);
        Stone stone1=new PreciousStone(20d,100d,1, PreciousStoneType.DIAMOND);
        Stone stone2=new SemipreciousStone(30d,150d,70, SemipreciousStoneType.AMBER);
        Stone stone3=new PreciousStone(50d,500d,90,PreciousStoneType.RUBY);
        stoneList=new ArrayList<>();
        stoneList.add(stone1);
        stoneList.add(stone2);
        stoneList.add(stone3);
        necklace=new Necklace(stoneList,collet);
    }
    @Test
    public void getStoneList() {
        Assert.assertNotNull(necklace);
        Assert.assertEquals(necklace.getStoneList().size(),3);
        Assert.assertEquals(necklace.getStoneList(),stoneList);
    }

    @Test
    public void getCollet() {
        Assert.assertNotNull(necklace);
        Assert.assertEquals(necklace.getCollet(),collet);
    }

    @Test
    public void setCollet() {
    Assert.assertNotNull(necklace);
    necklace.setCollet(new Collet(ColletMaterialType.SILVER));
    Assert.assertNotNull(necklace.getCollet());
    Assert.assertEquals(necklace.getCollet().getMaterial().name(),"SILVER");
    }


    @Test
    public void toStringTest() {
        Assert.assertNotNull(necklace);
        Assert.assertNotNull(necklace.toString());
    }
}