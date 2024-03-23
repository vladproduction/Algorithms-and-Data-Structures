package com.vladproduction.part1_changing_coins;

import static com.vladproduction.part1_changing_coins.GreedyChange.getMinimumCoins;

/**
 * Created by vladproduction on 22-Mar-24
 */

public class Main01 {
    public static void main(String[] args) {

        int amount = 127;
        int[] denominations = {25, 10, 5, 1}; // Quarters, Dimes, Nickels, Pennies

        int[] coinsUsed = getMinimumCoins(amount, denominations);

        System.out.println("Minimum coins needed for $" + amount + ":");
        for (int i = 0; i < denominations.length; i++) {
            if (coinsUsed[i] > 0) {
                System.out.println(coinsUsed[i] + " x $" + denominations[i]);
            }
        }
    }

    /**This algorithm is greedy because at each step, it chooses the denomination that provides the most value
     * (highest amount) for the remaining change. It doesn't consider the possibility of using a combination of
     * smaller denominations later that might be more efficient overall. However, in most cases for making change
     * with common denominations, this greedy approach will indeed find the minimum number of coins needed.*/


}
