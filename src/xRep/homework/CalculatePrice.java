package xRep.homework;

import java.util.Scanner;

public class CalculatePrice {

    // уже лучше, только тут есть момент, где можно меньше кода сделать, так как НДС считается от товара со скидкой
    public static double price(double costPrice, double count, double NDC) {
        double result = price(costPrice, count);
        return result * (1.0+NDC);

    }

    public static double price(double costPrice, double count) {
        boolean sale;
        if (count <= 9) {
            sale = false;
        } else {
            sale = true;
        }

        costPrice *= (1.0);

        if (sale) {
            costPrice *= 0.95;
        }

        return costPrice;
    }

    public static void main(String[] args) {
        double NDC = 0.2;
        Scanner a = new Scanner(System.in);
        System.out.println("цена товара");
        double cost = a.nextDouble();
        System.out.println("количество");
        double count = a.nextDouble();
        System.out.println("Is NDS include?(true/false)");
        boolean NDS = a.nextBoolean();
        if (NDS) {
            System.out.println(price(cost, count, NDC));
        } else {
            System.out.println(price(cost, count));
        }
    }

}
