package xRep.homework.variant1;

public class Student extends Human{

    private Performance performance;

    private Practic practic;

    public Student(String name, String secName, String lastName, int age, double baseValue, Performance performance, Practic practic) {
        super(name, secName, lastName, age, baseValue);
        this.performance = performance;
        this.practic = practic;
    }

    public double salary(){
        return getBaseValue()*performance.getKeff();
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public Practic getPractic() {
        return practic;
    }

    public void setPractic(Practic practic) {
        this.practic = practic;
    }

}
