package myDevelopment.forIntegerAndDouble;

import myDevelopment.forArrays.AddToArrayValue;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        //CheckNumberIsPrime.CheckPrimeInteger(6);
    }

    public static int[] CheckPrime(int a){
        int k=0;
        int[] array = {};
        for(int i=2;i<=(a/2);i++){
            if(a%i==0){
                k+=1;
                array=AddToArrayValue.AddNumber(array,i);
            }
        }
        return array;
    }
    public static double[] CheckPrime(double a) {
        int k = 0;
        double[] array = {};
        for (double i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                k += 1;
                array = AddToArrayValue.AddNumber(array,i);
            }
        }
        return array;
    }
}
