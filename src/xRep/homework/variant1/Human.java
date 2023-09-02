package xRep.homework.variant1;

public class Human {

    private String name;

    private String secName;

    private String lastName;

    private int age;

    private double baseValue;

    public Human(String name, String secName, String lastName, int age, double baseValue) {
        this.name = name;
        this.secName = secName;
        this.lastName = lastName;
        this.age = age;
        this.baseValue=baseValue;
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

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
}
