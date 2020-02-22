package com.company.matrixes;

/**
 * Created by sonasargsyan on 2/21/20.
 */
public class TransposeMatrix {

    public int[][] transposeMatrix(int[][] mat, int row, int col) {

        int[][] transpose = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = mat[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }

}
