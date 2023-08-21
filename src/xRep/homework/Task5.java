package xRep.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        try{
            Scanner number = new Scanner(System.in);
            int a=number.nextInt();
            int b= number.nextInt();
            System.out.println(a+b);
        }catch (InputMismatchException ex){
            System.out.println(ex.getMessage() +" - " + "нахуй отсюда");
        }
    }
}
