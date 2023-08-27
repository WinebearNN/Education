package xRep.homework.variant4;

public class Manager {

    private String name;

    private String secName;

    private String lastName;

    private int age;

    private Character character;

    private Position position;

    private Priority priority;

    public Manager(String name, String secName, String lastName, int age, Character character, Position position, Priority priority) {
        this.name = name;
        this.secName = secName;
        this.lastName = lastName;
        this.age = age;
        this.character = character;
        this.position=position;
        this.priority=priority;
    }

    public int getAge() {
        return age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
