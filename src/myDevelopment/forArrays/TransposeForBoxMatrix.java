package myDevelopment.forArrays;



import java.util.Arrays;

public class TransposeForBoxMatrix {
    public static double[][] TransposeForBoxDoubleMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.copyOf(matrix[i], matrix.length);
        }
        double tempValue = matrix[0][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
        matrix[1][0] = tempValue;
        return matrix;
    }
    public static int[][] TransposeForBoxIntMatrix(int[][] matrix){
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
        return matrix;

    }
}
