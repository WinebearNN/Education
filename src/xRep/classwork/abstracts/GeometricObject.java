package xRep.classwork.abstracts;

public abstract class GeometricObject {
    protected String color;
    protected boolean filled;
    public abstract double getArea();
    public abstract double getPerimetr();

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
}
