package com.tolpawsta.task1.stones.entity.stone;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SemipreciousStoneTest {
    private SemipreciousStone semipreciousStone;
    @Before
    public void setUp(){
        //actual preciousStone
        semipreciousStone =new SemipreciousStone(1d,1d,100,SemipreciousStoneType.AMBER);
    }
    @Test
    public void getNameTest() { //
        Assert.assertTrue(semipreciousStone.getName() instanceof SemipreciousStoneType);
    }

    @Test
    public void setNameTest() {
        Assert.assertNotNull(semipreciousStone);
        semipreciousStone.setName(SemipreciousStoneType.AMETHYST);
        Assert.assertEquals(semipreciousStone.getName().name(),"AMETHYST");
    }

    @Test
    public void toStringTest() {
        Assert.assertNotNull(semipreciousStone);
        Assert.assertNotNull(semipreciousStone.toString());
    }
}