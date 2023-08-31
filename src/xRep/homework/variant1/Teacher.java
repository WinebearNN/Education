package xRep.homework.variant1;

public class Teacher extends Student{

    private double countOfHours;

    public Teacher(String name, String secName, String lastName, int age, double baseValue, double countOfHours) {
        super(name, secName, lastName, age, baseValue);
        this.countOfHours=countOfHours;
    }

    public double keffHours(){
        return countOfHours/60;
    }

    public double salary() {
        return this.getBaseValue()*this.keffHours();
    }

    public double getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(double countOfHours) {
        this.countOfHours = countOfHours;
    }


}
