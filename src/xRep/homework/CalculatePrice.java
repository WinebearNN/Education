package xRep.homework;

import java.util.Scanner;

public class CalculatePrice {
    public static double Price(double costPrice,double count, boolean NDS){
        boolean sale;
        if(count<=9){
            sale = false;
        }else{
            sale = true;
        }
        if(NDS){
            costPrice*=1.2;
        }
        if(sale){
            costPrice*=0.95;
        }

        return costPrice;
    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("цена товара");
        double cost=a.nextDouble();
        System.out.println("количество");
        double count=a.nextDouble();
        System.out.println("Is NDS include?(true/false)");
        boolean NDS = a.nextBoolean();
        System.out.println(Price(cost,count,NDS));
    }

}
