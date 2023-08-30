package xRep.homework.variant4;

public class Member extends Manager{
    private Priority priority;
    public Member(String name, String secName, String lastName, int age,Priority priority) {
        super(name, secName, lastName, age);
        this.priority=priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
