package com.tolpawsta.task1.stones.entity.stone;

import org.junit.Assert;
import org.junit.Test;


public class SemipreciousStoneTypeTest {

    @Test
    public void findSemipresiousStoneType() {
        Assert.assertTrue(SemipreciousStoneType.find("AMETHYST") instanceof SemipreciousStoneType);
    }
    @Test
    public void findNull() {
        Assert.assertNull(SemipreciousStoneType.find("TEST"));
    }

}