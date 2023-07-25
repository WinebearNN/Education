package myDevelopment.forArrays;

import myDevelopment.forIntegerAndDouble.CheckNumberIsPrime;

public class FindPrimeNumbersInArrayOrMatrix {
    public static double[] FindPrimeNumbersArray(double[] array) {
        double[] tempArray = {};
        for (int i = 0; i < array.length; i++) {
            if (CheckNumberIsPrime.CheckPrime(array[i]).length == 0) {
                tempArray = AddToArrayValue.AddNumber(tempArray, array[i]);
            }
        }
        return tempArray;
    }

    public static int[] FindPrimeNumbersArray(int[] array) {
        int[] tempArray = {};
        for (int i = 0; i < array.length; i++) {
            if (CheckNumberIsPrime.CheckPrime(array[i]).length == 0) {
                tempArray = AddToArrayValue.AddNumber(tempArray, array[i]);
            }
        }
        return tempArray;
    }

    public static int[] FindPrimeNumbersMatrix(int[][] matrix) {
        int[] tempArray = {};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (CheckNumberIsPrime.CheckPrime((matrix[i][j])).length == 0) {
                    tempArray = AddToArrayValue.AddNumber(tempArray, matrix[i][j]);
                }
            }
        }
        return tempArray;

    }

    public static double[] FindPrimeNumbersMatrix(double[][] matrix) {
        double[] tempArray = {};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (CheckNumberIsPrime.CheckPrime((matrix[i][j])).length == 0) {
                    tempArray = AddToArrayValue.AddNumber(tempArray, matrix[i][j]);
                }
            }
        }
        return tempArray;
    }
}
