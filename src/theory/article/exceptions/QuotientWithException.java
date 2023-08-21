package theory.article.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int a,int b){
        if (b==0){
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        try{
            System.out.println(quotient(a,b));
        }catch (ArithmeticException ex){
            System.out.println("Exception: You can not divide a number by zero");
        }

    }
}
