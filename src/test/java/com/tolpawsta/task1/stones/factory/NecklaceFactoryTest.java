package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NecklaceFactoryTest {

    @Test
    public void generateNecklaceNotNull() {
        Necklace necklace=NecklaceFactory.generateNecklace();
        Assert.assertTrue(necklace.getCollet() instanceof Collet);
        Assert.assertTrue(necklace.getStoneList().size()>0);
    }
}