package xRep.homework.colorable;

import xRep.classwork.abstracts.GeometricObject;

import java.util.Scanner;

public class Square extends GeometricObject implements Colorable {

    private double side;

    @Override
    public String toString() {
        howToColor();
        return "side=" + side + "  " + getArea()+ "   " + getPerimetr() + "\n" ;
    }

    public Square() {
        this.side = 0;
    }

    public Square( double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimetr() {
        return side*4;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все 4 стороны");
    }
}
class Test{
    public static void main(String[] args) {
        GeometricObject[] a=new GeometricObject[5];
        Scanner input=new Scanner(System.in);
        double side=input.nextDouble();
        for (int i=0;i<a.length;i++){
            a[i]=new Square(side);
        }
        for (GeometricObject i:a){
            System.out.println(i);
        }
    }
}
