package xRep.homework;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        matrix[0] = new int[]{2, 7};
        matrix[1] = new int[]{3, 8};
        matrix[2] = new int[]{4, 9};
        matrix[3] = new int[]{5, 10};
        matrix[4] = new int[]{6, 11};
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.copyOf(matrix[i], matrix.length);
        }
        int tempValue = matrix[0][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
        matrix[1][0] = tempValue;
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
    }
}