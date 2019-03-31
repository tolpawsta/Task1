package com.tolpawsta.task1.stones.entity.stone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoneTest {
        private Stone stone;

        @Before
        public void setUp() {
            //Opacity must be beetwen 1 and 100
            //Weight and Price must be more than 0
            double weight = 20.00;
            double price = 20.00;
            int opacity = 20;
            stone = new PreciousStone(weight, price, opacity, PreciousStoneType.DIAMOND);
        }

        @After
        public void tearDown() {
            stone = null;
        }


        @Test
        public void setOpacityEqualTest() {

            assertEquals(stone.getOpacity(), 20);

        }

        @Test
        public void setOpacityNotEqualTest() {
            assertNotEquals(stone.getOpacity(), -1);

        }

        @Test
        public void setWeightEqualTest() {
            assertEquals(stone.getWeight(), 20d, 0.0001);
        }

        public void setWeightTestNotEqualTest() {
            assertNotEquals(stone.getWeight(), 0d, 0.0001);
        }

        @Test
        public void setPriceTestEqual() {
            assertEquals(stone.getPrice(), 20d, 0.0001);
        }
    //TODO: Ask for test get or set methods
        @Test
        public void setPriceTestNotEqual() {
            assertNotEquals(stone.getPrice(), 0d, 0.0001);
        }


    @Test
    public void toStringTest() {
        Assert.assertNotNull(stone.toString());
    }
}