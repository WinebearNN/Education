package xRep.homework.variant1;

public enum Performance {

    HIGH("ONLY_FIVE",1.5),

    MEDIUM("FOUR",1.0),

    LOW("THREE",0.5),

    ZERO("TWO",0.0);

    private String marks;

    private double keff;

    Performance(String marks, double keff) {
        this.marks = marks;
        this.keff = keff;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public double getKeff() {
        return keff;
    }

    public void setKeff(double keff) {
        this.keff = keff;
    }
}
