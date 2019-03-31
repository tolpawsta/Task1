package com.tolpawsta.task1.stones.entity.stone;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PreciousStoneTypeTest {

    @Test
    public void findPresiousStoneType() {
        Assert.assertTrue(PreciousStoneType.find("DIAMOND") instanceof PreciousStoneType);
    }
    @Test
    public void findNull() {
        Assert.assertNull(PreciousStoneType.find("TEST"));
    }
}