package xRep.homework.variant4;

public class Minister extends Manager{

    private  Character character;

    private Position position;

    public Minister(String name, String secName, String lastName, int age, Position position,Character character) {
        super(name, secName, lastName, age);
        this.position=position;
        this.character=character;
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
}
