package com.vladproduction.part4_knapsack_problem.fractional_knapsack;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Fractional_knapsack {
    public static void main(String[] args) {

        final Item item1 = new Item(4, 20); //value per unit: 5.0
        final Item item2 = new Item(3, 18); //value per unit: 6.0
        final Item item3 = new Item(2, 14); //value per unit: 7.0
        final Item[] items = {item1, item2, item3};

        //1.sorting by unit value:  O(n*log(n))
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnit).reversed());
        System.out.println(Arrays.toString(items));

        //2.define capacity of knapsack by weight:
        final int W = 7;

        //3.using algorithm:
        double value = getValue(items, W);
        System.out.println("Value of knapsack (by uniting items depending of weight and value): " + value);
    }

    private static double getValue(Item[] items, int W) {
        int weightSoFar = 0;
        double valueSoFar = 0.0;
        int currentItem = 0;
        while (currentItem < items.length && weightSoFar != W){
            if(weightSoFar + items[currentItem].getWeight() < W){
                //took item as full one
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            }else {
                //took as part of item
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) * items[currentItem].getValue();
                weightSoFar = W; //knapsack is full now
            }
            currentItem++;
        }
        return valueSoFar;
    }

}
