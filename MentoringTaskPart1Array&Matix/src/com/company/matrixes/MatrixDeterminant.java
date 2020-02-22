package com.company.matrixes;

import java.util.Scanner;

/**
 * Created by sonasargsyan on 2/21/20.
 */
public class MatrixDeterminant {

    // Function to get cofactor of matrix
    public int[][] getCofactor(int mat[][], int rowIndex, int columnIndex, int n) {
        int temp[][] = new int[n - 1][n - 1];
        int i = 0;
        int j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != rowIndex && col != columnIndex) {
                    temp[i][j++] = mat[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
        return temp;
    }


    // Recursive function for finding determinant
    public int determinantOfMatrix(int mat[][], int n) {
        int D = 0;
        int sign = 1;

        if (n == 1)
            return mat[0][0];

        // Iterate for each element of first row
        for (int col = 0; col < n; col++) {
            D += sign * mat[0][col]
                    * determinantOfMatrix(getCofactor(mat, 0, col, n), n - 1);

            sign = -sign;
        }

        return D;
    }

    public float[][] getReturnMatrix(int mat[][], int determinant, int n) {
        int minor;
        if (determinant == 0)
            return null;

        float returnMatrix[][] = new float[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                minor = determinantOfMatrix(getCofactor(mat, col, row, n), n - 1);
                returnMatrix[row][col] = (float) minor / determinant;
            }
        }
        return returnMatrix;
    }

    // Function for displaying the matrix
    public void display(float mat[][], int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(mat[row][col] + "      ");
            }
            System.out.println();
        }
    }

}
