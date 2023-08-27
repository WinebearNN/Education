package xRep.homework.variant4;

public enum Position {

    MINISTER("minister"),

    PRIME_MINISTER("prime_minister"),

    NONE("not_a_minister");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
