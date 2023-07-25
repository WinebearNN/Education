package myDevelopment.forIntegerAndDouble;

public class Factorial {
    public static int FactorialInteger(int a){
        int prov=1;
        for(int i = a; i>0;i--){
            prov*=i;
        }
        return prov;

    }
}
