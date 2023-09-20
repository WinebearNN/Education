package xRep.homework.variant2;

public class FactoryBoss extends Person {

    private Engineer[] engineers;

    public FactoryBoss(String name, String surname, String lastname, int age, Engineer[] engineers) {
        super(name, surname, lastname, age);
        this.engineers = engineers;
    }

    public double salary() {
        double temp = 0;
        int count = 0;
        for (Engineer i : engineers) {
            temp += i.averageK();
            count++;
        }
        temp /= count;
        if (temp >= 1.3) {
            return getBaseValue() * 1.5;
        }
        if (temp >= 1.1) {
            return getBaseValue() * 1.25;
        }
        return getBaseValue();
    }

    public Engineer[] getEngineers() {
        return engineers;
    }

    public void setEngineers(Engineer[] engineers) {
        this.engineers = engineers;
    }
}
