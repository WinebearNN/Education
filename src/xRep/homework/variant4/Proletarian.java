package xRep.homework.variant4;

public class Proletarian extends Manager{
    private Character character;
    public Proletarian(String name, String secName, String lastName, int age, Character character) {
        super(name, secName, lastName, age);
        this.character=character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
