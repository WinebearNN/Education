package xRep.homework.variant1;

public class Project {

    private String name;

    private int countOfHours;

    public Project(String name, int countOfHours) {
        this.name = name;
        this.countOfHours = countOfHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }
}
