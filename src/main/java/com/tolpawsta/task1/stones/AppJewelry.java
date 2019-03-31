package com.tolpawsta.task1.stones;

import com.tolpawsta.task1.stones.assistant.NecklaceAssistant;
import com.tolpawsta.task1.stones.factory.NecklaceFactory;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *  Use JavaDoc to describe class
 */
public class AppJewelry {

    private static final Logger logger = Logger.getLogger(AppJewelry.class);

    /**
     * Use java doc to describe method
     * @param args input params
     */
    public static void main(String[] args) {
        logger.debug("Аpplication method main has started");

        Necklace necklace = NecklaceFactory.generateNecklace();
        NecklaceAssistant assistant = NecklaceAssistant.getNecklaceAssistant();
        Random random = new Random();

        int firstvalueopacity = random.nextInt(100);
        int secondvalueopacity = random.nextInt(100);

        logger.info(necklace.toString());
        try {
            double totalcaratweight = assistant.calculateTotalCaratWeight(necklace.getStoneList());
            logger.info("========================================================"); // if you wont use some separator, do not create property
            logger.info(String.format("totalcaratweight: %2.2f", totalcaratweight)); // if you use String.format, write all string inside

        }catch (StoneException e){
            logger.error(e.getMessage(),e);
        }

        try {
            double totalPrice = assistant.calculateTotalPrice(necklace.getStoneList());
            logger.info("========================================================");
            logger.info(String.format("totalprice: %2.2f", totalPrice));// if you use String.format, write all string inside

        } catch (StoneException e){
            logger.error(e.getMessage());
        }

        logger.info("========================================================");
        try {
            assistant.stonesSortByPrice(necklace.getStoneList());
        } catch (StoneException e){
            logger.error(e.getMessage(),e);
        }
        logger.info("Necklace's stones sorted by price:");
        logger.info(necklace.toString());
        logger.info("========================================================");

        try {
            List<Stone> foundStonesByOpacity = assistant.findStonesByOpacity(firstvalueopacity, secondvalueopacity, necklace.getStoneList());
            assistant.printFoundStonesByOpacity(foundStonesByOpacity);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex); // use error in catch exception
        }
    }
}
