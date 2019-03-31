package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.ColletException;
import com.tolpawsta.task1.stones.entity.collet.Collet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColletFactoryTest {

    @Test(expected = ColletException.class)
    public void createColletError() throws ColletException{
        ColletFactory.createCollet("TEST");
    }
    @Test
    public void createColletNotNull() throws ColletException{
        Assert.assertNotNull(ColletFactory.createCollet("GOLD"));
        Assert.assertTrue(ColletFactory.createCollet("GOLD") instanceof Collet);
    }
}