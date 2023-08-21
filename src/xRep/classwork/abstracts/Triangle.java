package xRep.classwork.abstracts;

public class Triangle extends GeometricObject {
    private double side1,side2,side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea(){
        double p=(side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side1)*(p-side1));
    }

    @Override
    public double getPerimetr() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return  "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                ", filled=" + filled + " " + getArea() + " " + getPerimetr();
    }
}
