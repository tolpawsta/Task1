package com.tolpawsta.task1.stones.entity.collet;

import com.tolpawsta.task1.stones.ColletException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColletMaterialTypeTest {

    //TODO: ask for right name of method
    @Test
    public void findNotNullAndGetType() {
        Assert.assertNotNull(ColletMaterialType.find("GOLD"));
        Assert.assertTrue(ColletMaterialType.find("GOLD") instanceof ColletMaterialType);
    }

    @Test
    public void findNull(){
        Assert.assertNull(ColletMaterialType.find("TEST"));
    }
}