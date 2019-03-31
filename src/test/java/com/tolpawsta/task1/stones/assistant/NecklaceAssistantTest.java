package com.tolpawsta.task1.stones.assistant;

import com.tolpawsta.task1.stones.StoneException;
import com.tolpawsta.task1.stones.entity.collet.Collet;
import com.tolpawsta.task1.stones.entity.collet.ColletMaterialType;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NecklaceAssistantTest {

   private Collet collet;
   private List<Stone> stoneList;
   private Necklace necklace;
   private NecklaceAssistant necklaceAssistant;
    @Before
    public void setUp(){
        collet=new Collet(ColletMaterialType.GOLD);
        Stone stone1=new PreciousStone(20d,100d,1, PreciousStoneType.DIAMOND);
        Stone stone2=new SemipreciousStone(30d,600d,70, SemipreciousStoneType.AMBER);
        Stone stone3=new PreciousStone(50d,500d,90,PreciousStoneType.RUBY);
        stoneList=new ArrayList<>();
        stoneList.add(stone1);
        stoneList.add(stone2);
        stoneList.add(stone3);
        necklace=new Necklace(stoneList,collet);
        necklaceAssistant=NecklaceAssistant.getNecklaceAssistant();
    }

    @Test
    public void getNecklaceAssistantTest() {
        Assert.assertNotNull(NecklaceAssistant.getNecklaceAssistant());
    }


    @Test
    public void stonesSortByPriceEquals() throws StoneException {
        Assert.assertNotNull(stoneList);
        necklaceAssistant.stonesSortByPrice(stoneList);
        Stone actual=new SemipreciousStone(30d,600d,70, SemipreciousStoneType.AMBER);
        Assert.assertNotEquals(stoneList.get(2),actual);
    }
    @Test(expected = StoneException.class)
    public void stonesSortByPriceEqualsNullException() throws StoneException {
        necklaceAssistant.stonesSortByPrice(null);

    }
    @Test
    public void findStonesByOpacitySize2() throws Exception {
        int extented=necklaceAssistant.findStonesByOpacity(1,70,stoneList).size();
        Assert.assertEquals(extented,2);
    }
    @Test(expected = Exception.class)
    public void findStonesByOpacityNullException() throws Exception {
       necklaceAssistant.findStonesByOpacity(1,70,null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void findStonesByOpacityStartValueException() throws Exception {
        necklaceAssistant.findStonesByOpacity(-1,70,stoneList);
    }
    @Test(expected = StoneException.class)
    public void calculateTotalCaratWeightNullException() throws StoneException {
        necklaceAssistant.calculateTotalCaratWeight(null);
    }
    @Test
    public void calculateTotalCaratWeight() throws StoneException {
        Assert.assertEquals(necklaceAssistant.calculateTotalCaratWeight(stoneList),100d,0.001);
    }

    @Test(expected = StoneException.class)
    public void calculateTotalPriceNullException() throws StoneException {
        necklaceAssistant.calculateTotalPrice(null);
    }
    @Test
    public void calculateTotalPrice() throws StoneException {
        Assert.assertEquals(necklaceAssistant.calculateTotalPrice(stoneList),1200d,0.001);
    }

    @Test(expected = StoneException.class)
    public void printFoundStonesByOpacitySize0Exception()throws StoneException {
        List<Stone> stoneList1=new ArrayList<>();
       necklaceAssistant.printFoundStonesByOpacity(stoneList1);
    }
    @Test
    public void printFoundStonesByOpacityTest()throws StoneException {
        necklaceAssistant.printFoundStonesByOpacity(stoneList);

    }
}