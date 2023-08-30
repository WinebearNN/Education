package xRep.homework.variant4;

public class Confederation extends Republic {

    private Republic[] republics;

    public Confederation(Manager[] managers, Republic[] republics) {
        super(managers);
        this.republics = republics;
    }

    public Republic[] getRepublics() {
        return republics;
    }

    public void setRepublics(Republic[] republics) {
        this.republics = republics;
    }

}

