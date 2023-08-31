package xRep.homework.variant1;

public class Student {

    private String name;

    private String secName;

    private String lastName;

    private int age;

    private Performance performance;

    private Practic practic;

    private double baseValue;

    public Student(String name, String secName, String lastName, int age, Performance performance, Practic practic, double baseValue) {
        this.name = name;
        this.secName = secName;
        this.lastName = lastName;
        this.age = age;
        this.performance = performance;
        this.practic = practic;
        this.baseValue=baseValue;
    }

    public Student(String name, String secName, String lastName, int age, double baseValue) {
        this.name = name;
        this.secName = secName;
        this.lastName = lastName;
        this.age = age;
        this.baseValue=baseValue;
    }

    public double salary(){
        return baseValue*performance.getKeff();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
}
