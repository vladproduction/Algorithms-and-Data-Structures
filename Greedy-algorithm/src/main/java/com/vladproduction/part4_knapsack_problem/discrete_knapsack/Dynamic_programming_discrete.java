package com.vladproduction.part4_knapsack_problem.discrete_knapsack;

/**
 * Created by vladproduction on 23-Mar-24
 */
/**classic example of dynamic programming*/
public class Dynamic_programming_discrete {
    public static void main(String[] args) {

        int[] weights = {4, 3, 2};
        int[] values = {20, 18, 14};
        int capacity = 7;

        int maxProfit = knapsack(weights, values, capacity);
        System.out.println("Maximum profit: " + maxProfit);

    }

    private static int knapsack(int[] weights, int[] values, int capacity) {

        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Base cases: No items or no capacity
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // No capacity, profit is 0
        }
        for (int j = 0; j <= capacity; j++) {
            dp[0][j] = 0; // No items, profit is 0
        }
        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                // If the current item's weight is greater than the capacity
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j]; // Take the profit from the previous item
                } else {
                    // Choose the maximum profit between including or excluding the current item
                    dp[i][j] = Math.max(dp[i - 1][j], // Exclude current item
                            values[i - 1] + dp[i - 1][j - weights[i - 1]]); // Include current item
                }
            }
        }
        return dp[n][capacity]; // Maximum profit for given capacity

    }

    /**knapsack function:
     Takes weights, values, and capacity as input.
     Creates a 2D DP table dp of size (n + 1) x (capacity + 1).
     Fills the base cases: dp[i][0] and dp[0][j] with 0 (no capacity or no items).
     Iterates through the table, considering each item and capacity.
     For each cell dp[i][j], it calculates the maximum profit:
     If the current item's weight (weights[i - 1]) is greater than the capacity j, we cannot include it.
     So, the profit remains the same as the previous item dp[i - 1][j].
     Otherwise, we compare two options:
     Exclude the current item: profit remains dp[i - 1][j].
     Include the current item: profit is values[i - 1] (value of current item) + dp[i - 1][j - weights[i - 1]]
     (profit from remaining capacity after including the current item).
     Finally, dp[n][capacity] holds the maximum profit achievable for the given capacity.

     main function:
     Defines sample weights, values, and capacity for demonstration.
     Calls the knapsack function to find the maximum profit.
     Prints the maximum profit.*/
}
