package com.tolpawsta.task1.stones.assistant;

import com.tolpawsta.task1.stones.StoneException;
import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.Stone;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class NecklaceAssistant {

    private static final Logger logger = Logger.getLogger(NecklaceAssistant.class);


    private static NecklaceAssistant instance;

    private NecklaceAssistant() {
    }

    public static synchronized NecklaceAssistant getNecklaceAssistant() {
        return (instance == null) ? new NecklaceAssistant() : instance;
    }

    public void stonesSortByPrice(List<Stone> stoneList) throws StoneException {
        if (stoneList==null){
            throw new StoneException("stones not found");
        }
        Collections.sort(stoneList, new Comparator<Stone>() {
            @Override
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public List<Stone> findStonesByOpacity(int startValueOpacity, int endValueOpacity, List<Stone> stoneList) throws Exception{
        if (startValueOpacity <= 0 || endValueOpacity <= 0) {
            throw new IllegalArgumentException("Input params has invalid values"); //use typed exception
        }
        List<Stone> foundStones = new ArrayList<>();
        changeInputValues(startValueOpacity, endValueOpacity);
        for (Stone stone : stoneList) {
            if (stone.getOpacity() >= startValueOpacity && stone.getOpacity() <= endValueOpacity) {
                foundStones.add(stone);
            }
        }
        return foundStones;
    }
    private void changeInputValues(int start, int end) {
        if (start > end) {
            int buf = start;
            start = end; //FIXME: newer use
            end = buf; //FIXME: newer use
        }
    }

    public double calculateTotalCaratWeight(List<Stone> stoneList) throws StoneException{
       if (stoneList==null) throw new StoneException("stones not found");
        double totalweight = 0.0;
        for (Stone stone : stoneList) {
            totalweight += stone.getWeight();
        }
        return totalweight;
    }

    public double calculateTotalPrice(List<Stone> stoneList) throws StoneException{
        if (stoneList==null) throw new StoneException("stones not found");
        double totalprice = 0.0;
        for (Stone stone : stoneList) {
            totalprice += stone.getPrice();
        }
        return totalprice;
    }

    public void printFoundStonesByOpacity(List<Stone> foundStoneList) throws StoneException {
        if (foundStoneList.size()==0) throw new StoneException("Stones of the desired opacity were not found.");
        logger.info("Found stones of the desired opacity:");
        for (Stone stone : foundStoneList) {
            logger.info(stone.toString());
        }
    }
}
