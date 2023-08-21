package xRep.classwork.abstracts;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        Boolean filled=input.nextBoolean();
        String color=input.nextLine();
        Triangle triangle=new Triangle(color,filled,side1,side2,side3);
        System.out.println(triangle);
    }

}
