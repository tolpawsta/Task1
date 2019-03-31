package com.tolpawsta.task1.stones;

import com.tolpawsta.task1.stones.entity.stone.Stone;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoneUtilsTest {

    @Test(expected = StoneException.class)
    public void validateStoneWeightExceptionTest() throws StoneException {
        StoneUtils.validateStone(-1d,2d,3);
    }
    @Test(expected = StoneException.class)
    public void validateStonePriceExceptionTest() throws StoneException {
        StoneUtils.validateStone(1d,-2d,3);
    }
    @Test(expected = StoneException.class)
    public void validateStoneOpacityExceptionLessZeroTest() throws StoneException {
        StoneUtils.validateStone(1d,2d,-3);
    }
    @Test (expected = StoneException.class)
    public void validateStoneOpacityExceptionMore100Test() throws StoneException {
        StoneUtils.validateStone(1d,2d,101);
    }
    @Test
    public void validateStoneNotExeptionTest()throws StoneException{
        StoneUtils.validateStone(1d,2d,100);
    }
    }