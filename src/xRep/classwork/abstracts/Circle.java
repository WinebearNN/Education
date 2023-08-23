package xRep.classwork.abstracts;

public class Circle extends GeometricObject {

    private double radius;

    final double p=3.14;

    public Circle() {

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.p*this.radius;
    }

    @Override
    public double getPerimetr() {
        return this.p*this.radius*2;
    }

    @Override
    public String toString() {
        return
                "circle " + radius +"/|__|_/"+  this.getArea() +" " ;

    }
}
