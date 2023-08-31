package xRep.homework.variant1;

public class ZavKafedry extends Teacher{

    private Teacher[] teachers;

    public ZavKafedry(String name, String secName, String lastName, int age, double baseValue, double countOfHours, Teacher[] teachers) {
        super(name, secName, lastName, age, baseValue, countOfHours);
        this.teachers=teachers;
    }

    @Override
    public double salary() {
        return super.salary()*1.6;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
