package xRep.homework.variant1;

public class ZavKafedry extends Teacher{

    private Teacher[] teachers;

    public ZavKafedry(String name, String secName, String lastName, int age, double baseValue, double countOfHours, Teacher... teachers) {
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

class Test{
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Vova","Zimin","Vladimirovich",20,70,80);
        Teacher teacher2=new Teacher("Vova","Zimin","Vladimirovich",20,70,80);
        Teacher teacher3=new Teacher("Vova","Zimin","Vladimirovich",20,70,80);
        Teacher[] teachers=new Teacher[]{teacher1,teacher3,teacher2};
        ZavKafedry zavKafedry = new ZavKafedry("Vova","Zimin","Vladimirovich",20,70,80,teacher1,teacher2,teacher3);
    }

}
