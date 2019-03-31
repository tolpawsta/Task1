package com.tolpawsta.task1.stones.factory;

import com.tolpawsta.task1.stones.StoneException;
import com.tolpawsta.task1.stones.entity.stone.PreciousStone;
import com.tolpawsta.task1.stones.entity.stone.PreciousStoneType;
import com.tolpawsta.task1.stones.entity.stone.SemipreciousStone;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import org.junit.Assert;
import org.junit.Test;

public class StoneFactoryTest {

    @Test(expected = StoneException.class)
    public void createFakeStone() throws StoneException {
        StoneFactory.createStone(1d, 1d, 1, "test");
    }

    @Test
    public void createStoneByPresciousType() throws StoneException {
        Stone stone = StoneFactory.createStone(1d, 1d, 1, "EMERALD");
        Assert.assertNotNull(stone);
        Assert.assertTrue(stone instanceof PreciousStone);
    }

    @Test
    public void createStoneInputParams() throws StoneException {
        Stone stone = StoneFactory.createStone(1d, 1d, 1, "EMERALD");
        Assert.assertNotNull(stone);
        Assert.assertEquals(1d, stone.getWeight(), 0.1);
        Assert.assertEquals(1d, stone.getPrice(), 0.1);
        Assert.assertEquals(1, stone.getOpacity());
    }

    @Test
    public void createStoneName() throws StoneException {
        Stone stone = StoneFactory.createStone(1d, 1d, 1, "EMERALD");
        Assert.assertNotNull(stone);
        Assert.assertTrue(stone instanceof PreciousStone);
        Assert.assertEquals(PreciousStoneType.EMERALD, ((PreciousStone) stone).getName());
    }

    @Test
    public void createStoneToString() throws StoneException {
        Stone stone = StoneFactory.createStone(1d, 1d, 1, "EMERALD");
        Assert.assertNotNull(stone);
        Assert.assertNotNull(stone.toString());
    }

    @Test
    public void createStoneBySemipresciousType() throws StoneException{
        Stone stone = StoneFactory.createStone(1d, 1d, 1, "AQUAMARINE");
        Assert.assertNotNull(stone);
        Assert.assertTrue(stone instanceof SemipreciousStone);
    }
}