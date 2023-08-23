package xRep.classwork.abstracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Scanner input = new Scanner(System.in);
//        double side1=input.nextDouble();
//        double side2=input.nextDouble();
//        double side3=input.nextDouble();
//        Boolean filled=input.nextBoolean();
//        String color=input.nextLine();
//        Triangle triangle=new Triangle(color,filled,side1,side2,side3);
        GeometricObject gb4=new Triangle("white",true,4,4,4);
        GeometricObject gb1=new Triangle("white",true,1,1,1);
        GeometricObject gb3=new Triangle("white",true,3,3,3);
        GeometricObject gb2=new Triangle("white",true,2,2,2);
//        System.out.println(triangle);
        ArrayList<GeometricObject> array= new ArrayList<>(List.of(gb1,gb2,gb3,gb4));
        GeometricObject gb4c=new Circle("white",true,4);
        GeometricObject gb1c=new Circle("white",true,1);
        GeometricObject gb3c=new Circle("white",true,3);
        GeometricObject gb2c=new Circle("white",true,2);
        ArrayList<GeometricObject> array1 = new ArrayList<>(List.of(gb1c,gb2c,gb3c,gb4c));
        GeometricObject[] a={gb1c,gb2c,gb1,gb1c};
        Collections.sort(array1);
        System.out.println(array1);
        System.out.println(Collections.max(array1));
        System.out.println();
        System.out.println(GeometricObject.sumArea(a));
    }

}
