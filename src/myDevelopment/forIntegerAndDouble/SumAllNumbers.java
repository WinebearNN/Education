package myDevelopment.forIntegerAndDouble;

public class SumAllNumbers {
    public static int SumAllNumbersFromPtoN(int firstNumber, int lastNumber,int step) {
        int value=0;
        for (int i=firstNumber;i<=lastNumber;i+=step){
            value+=i;
        }
        return value;
    }
}
