package com.tolpawsta.task1.stones;

import com.tolpawsta.task1.stones.assistant.NecklaceAssistant;
import com.tolpawsta.task1.stones.entity.factory.NecklaceFactory;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.Stone;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class AppJewelry {
 private static final Logger logger=Logger.getLogger(AppJewelry.class);
    public static void main(String[] args){
        logger.debug("Аpplication method main has started");
        Scanner in=new Scanner(System.in);
        logger.debug("Created instance of - "+in.toString());
        Necklace necklace= NecklaceFactory.createNecklace();
        NecklaceAssistant assistant=NecklaceAssistant.getNecklaceAssistant();
        Random random=new Random();
        int firstvalueopacity=random.nextInt(100);
        int secondvalueopacity=random.nextInt(100);
        String separetorstring="========================================================";
        necklace.information();
        double totalcaratweight =  assistant.calculateTotalCaratWeight(necklace.getStoneList());
        System.out.println(separetorstring);
        System.out.println("totalcaratweight: "+String.format("%2.2f",totalcaratweight));
        System.out.println(separetorstring);
        double totalprice=assistant.calculateTotalPrice(necklace.getStoneList());
        System.out.println("totalprice: "+String.format("%2.2f",totalprice));
        System.out.println(separetorstring);
        assistant.stonesSortByPrice(necklace.getStoneList());
       System.out.println("Necklace's stones sorted by price:");
       necklace.information();
        System.out.println(separetorstring);
        try {
            List<Stone> foundstonesbyopacity = assistant.findStonesByOpacity(5, 70, necklace.getStoneList());
            assistant.printFoundStonesByOpacity(foundstonesbyopacity);
        }catch (Exception ex){
            logger.warn(ex.getMessage());

        }




}
}
