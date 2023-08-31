package xRep.homework.variant1;

public class Researcher extends Teacher{

    private Student[] students;

    private Project[] projects;

    public Researcher(String name, String secName, String lastName, int age, double baseValue, double countOfHours, Student[] students, Project[] projects) {
        super(name, secName, lastName, age, baseValue, countOfHours);
        this.students=students;
        this.projects=projects;
    }

    public double salary() {
        int temp=0;
        for(Project i:projects){
            temp+=i.getCountOfHours();
        }
        return temp*0.05*this.getBaseValue();
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}
