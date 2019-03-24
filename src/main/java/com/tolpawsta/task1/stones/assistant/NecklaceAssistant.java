package com.tolpawsta.task1.stones.assistant;

import com.tolpawsta.task1.stones.entity.jewelry.Necklace;
import com.tolpawsta.task1.stones.entity.stone.Stone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NecklaceAssistant {
    private static NecklaceAssistant self=null;

    private NecklaceAssistant() {
        self=this;
    }

    public static synchronized NecklaceAssistant getNecklaceAssistant() {
        return (self==null)? new NecklaceAssistant():self;
    }

    public void stonesSortByPrice(List<Stone> stoneList){

            Collections.sort(stoneList, new Comparator<Stone>() {
                @Override
                public int compare(Stone o1, Stone o2) {
                    return Double.compare(o1.getPrice(),o2.getPrice());
                }
            });

    }
    public List<Stone> findStonesByOpacity(int startValueOpacity,int endValueOpacity,List<Stone> stoneList) throws Exception{
        List<Stone> foundStones=new ArrayList<Stone>();
        if(startValueOpacity>=0 && endValueOpacity>=0) {
            changeInputValues(startValueOpacity,endValueOpacity);
            for (Stone stone : stoneList) {
                if (stone.getOpacity() >= startValueOpacity && stone.getOpacity() <= endValueOpacity)
                    foundStones.add(stone);
            }
        }
        else throw new Exception("Input params has invalid values");
        return foundStones;
    }
    private void changeInputValues(int startvalue,int endvalue){
        if(startvalue>endvalue) {
            int buf=startvalue;
            startvalue=endvalue;
            endvalue=buf;

        }
    }
    public double calculateTotalCaratWeight(List<Stone> stoneList){
        double totalweight=0.0;
        for (Stone stone:stoneList) {
            totalweight+=stone.getWeight();
        }
        return totalweight;
    }
    public double calculateTotalPrice(List<Stone> stoneLict){
        double totalprice=0.0;
        for (Stone stone:stoneLict) {
            totalprice+=stone.getPrice();
        }
        return totalprice;
    }
    public void printFoundStonesByOpacity(List<Stone> foundstoneList){
        if (foundstoneList.size()>0){
            System.out.println("Found stones of the desired opacity:");
            for (Stone stone:foundstoneList) {
                System.out.println(stone.toString());
            }
        }
        else System.out.println("Stones of the desired opacity were not found.");
    }
}
