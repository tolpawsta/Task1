package com.tolpawsta.task1.stones.entity.stone;

import com.tolpawsta.task1.stones.factory.StoneFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PreciousStoneTest {

   private PreciousStone preciousStone;
    @Before
    public void setUp() {
        //actual preciousStone
        preciousStone =new PreciousStone(1d,1d,100,PreciousStoneType.EMERALD);
    }
    @Test
    public void getNameTest() { //
        Assert.assertTrue(preciousStone.getName() instanceof PreciousStoneType);
    }

    @Test
    public void setNameTest() {
        Assert.assertNotNull(preciousStone);
        preciousStone.setName(PreciousStoneType.DIAMOND);
        Assert.assertEquals(preciousStone.getName().name(),"DIAMOND");
    }

    @Test
    public void toStringTest() {
        Assert.assertNotNull(preciousStone);
        Assert.assertNotNull(preciousStone.toString());
    }
}