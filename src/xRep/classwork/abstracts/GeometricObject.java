package xRep.classwork.abstracts;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    protected String color;
    protected boolean filled;
    public abstract double getArea();
    public abstract double getPerimetr();

    public GeometricObject() {
    }
    public static double sumArea(GeometricObject[] a){
        double localVar=0;
        for (GeometricObject i:a){
            localVar+=i.getArea();
        }
        return localVar;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.getArea()>o.getArea()){
            return 1;
        }
        if(this.getArea()<o.getArea()){
            return -1;
        }
        return 0;
    }
}

