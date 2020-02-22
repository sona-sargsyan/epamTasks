package com.company.matrixes;

/**
 * Created by sonasargsyan on 2/21/20.
 */
public class DegreesClockwiseMatrix {

    public int[][] degreesClockwiseMatrix(int[][] mat, int row, int col) {

        int index = 0;
        int[][] clockwiseDegrees = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                clockwiseDegrees[i][index] = mat[i][j];
                System.out.print(clockwiseDegrees[i][index] + " ");
                index++;
            }
            System.out.println();
            index = 0;
        }
        return clockwiseDegrees;
    }
}
