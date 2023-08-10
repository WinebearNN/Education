package myDevelopment.testing;

import myDevelopment.forArrays.AddToArrayValue;
import myDevelopment.forArrays.FindPrimeNumbersInArrayOrMatrix;
import myDevelopment.forIntegerAndDouble.CheckNumberIsPrime;
import myDevelopment.forIntegerAndDouble.Factorial;
import myDevelopment.forIntegerAndDouble.SumAllNumbers;

import java.util.Arrays;

public class ZZTesting {

}


class TestDeleteWhiteSpacesFromStrings {
    public static void main(String[] args) {

        double[][] matrix = new double[2][];
        matrix[0] = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        matrix[1] = new double[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //System.out.println(Arrays.toString(array));
        //System.out.println(Factorial.FactorialInteger(5));
        //System.out.println(SumAllNumbers.SumAllNumbersFromPtoN(1,10,2));
        //System.out.println(Arrays.toString(CheckNumberIsPrime.CheckPrime((16.0))));
        //System.out.println(Arrays.toString(FindPrimeNumbersInArrayOrMatrix.FindPrimeNumbersArray(array)));
        System.out.println(Arrays.toString(FindPrimeNumbersInArrayOrMatrix.FindPrimeNumbersMatrix(matrix)));
    }
}



