package com.vladproduction.part4_knapsack_problem.fractional_knapsack;

/**
 * Created by vladproduction on 23-Mar-24
 */

public class Item {

    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnit(){
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "w=" + weight +
                ", v=" + value +
                '}';
    }
}
