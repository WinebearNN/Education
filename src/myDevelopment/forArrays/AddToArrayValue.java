package myDevelopment.forArrays;

import java.util.Arrays;

public class AddToArrayValue {
    public static int[] AddNumber(int[] array, int a) {
        int[] array1 = Arrays.copyOf(array, (array.length + 1));
        array1[array.length] = a;
        return array1;
    }

    public static double[] AddNumber(double[] array, double a) {
        double[] array1 = Arrays.copyOf(array, (array.length + 1));
        array1[array.length] = a;
        return array1;
    }
}
