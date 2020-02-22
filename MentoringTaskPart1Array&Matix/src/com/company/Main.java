package com.company;
import com.company.arrays.RevertStringsInArray;
import com.company.arrays.SecondByLengthStringInArray;
import com.company.matrixes.DegreesClockwiseMatrix;
import com.company.matrixes.MatrixDeterminant;
import com.company.matrixes.TransposeMatrix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int mat[][] = {{1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}};
        String[] stringList = {"firstword", "secondword", "verylongword", "third", "fourth"};

        System.out.println("Initial Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Transpose Matrix");
        TransposeMatrix transposedObject = new TransposeMatrix();
        int[][] temp = transposedObject.transposeMatrix(mat, mat.length, mat[0].length);

        System.out.println();
        System.out.println();

        System.out.println("90 Degree Clockwise Turned Matrix");
        DegreesClockwiseMatrix clockwiseMatrixObj = new DegreesClockwiseMatrix();
        clockwiseMatrixObj.degreesClockwiseMatrix(temp, mat.length, mat[0].length);

        System.out.println();
        System.out.println();

        MatrixDeterminant determinantMatrix = new MatrixDeterminant();
        System.out.print("Determinant of the matrix is: " +
                determinantMatrix.determinantOfMatrix(mat, mat.length));

        System.out.println();
        System.out.println();

        System.out.println("Return Matrix");
        determinantMatrix.display(determinantMatrix.getReturnMatrix(mat, determinantMatrix.determinantOfMatrix(mat, mat.length), mat.length), mat.length);

        System.out.println();
        System.out.println();
        System.out.println("Initial Strings: " + Arrays.toString(stringList));

        SecondByLengthStringInArray obj = new SecondByLengthStringInArray(stringList);
        String[] arrayWithoutMaxString = obj.removeTheElement(stringList, obj.getMaxElementIndex(stringList));
        int indexOfSecondMaxElement = obj.getMaxElementIndex(arrayWithoutMaxString);
        System.out.println("The second by length string: " + arrayWithoutMaxString[indexOfSecondMaxElement]);

        System.out.println();
        System.out.println();
        RevertStringsInArray revertStringsInArray = new RevertStringsInArray(stringList);
        System.out.println("Reverted: " + Arrays.toString(revertStringsInArray.reverseArray(stringList)));
    }
}
