package com.vladproduction.part1_changing_coins;

/**
 * Created by vladproduction on 22-Mar-24
 */
/**You want to make change for a certain amount of money using the fewest number of coins possible.
 * You have denominations of coins available, like quarters, dimes, nickels, and pennies.*/
public class GreedyChange {

    public static int[] getMinimumCoins(int amount, int[] denominations) {
        int[] coins = new int[denominations.length]; // To store the number of coins used for each denomination
        int remaining = amount;

        for (int i = 0; i < denominations.length; i++) {
            // Get the maximum number of the current denomination that fits in the remaining amount
            coins[i] = remaining / denominations[i];
            // Update the remaining amount after using those coins
            remaining -= coins[i] * denominations[i];
        }

        // Check if the remaining amount is zero (meaning we made exact change)
        if (remaining > 0) {
            throw new IllegalArgumentException("Cannot make exact change with provided denominations");
        }

        return coins;
    }
}
