package com.vladproduction.examples;

/**
 * Created by vladproduction on 22-Mar-24
 */
/**Algorithms with nested loops typically have quadratic time complexity (O(n^2))*/
public class NestedLoops_O_n_2 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        boolean symmetric = isSymmetric(matrix);
        System.out.println("symmetric = " + symmetric);
    }

    /**This function checks if a matrix is symmetrical. The outer loop iterates through each row,
     * and the inner loop iterates through each element in that row.
     * The total number of iterations grows quadratically with the matrix size.*/
    private static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
