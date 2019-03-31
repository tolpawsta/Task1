package com.tolpawsta.task1.stones.entity.collet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColletTest {
// actual collet
   private Collet collet;
    @Before
    public void setUp(){
      collet=new Collet(ColletMaterialType.GOLD);
    }

    @Test
    public void getMaterialTest() {
        Assert.assertTrue(collet.getMaterial() instanceof ColletMaterialType);
    }
//TODO Ask about configuration
    @Test
    public void setMaterial() {
        Assert.assertNotNull(collet);
        collet.setMaterial(ColletMaterialType.SILVER);
        Assert.assertEquals(collet.getMaterial().name(),"SILVER");
    }

    @Test
    public void toStringTest() {
        Assert.assertNotNull(collet.toString());
    }
}