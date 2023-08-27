package xRep.homework.variant4;

public class Confederation extends Republic {

    private Monarchy[] monarchies;

    private Republic[] republics;

    private PresidentRepublic[] presidentRepublics;

    public Confederation(Manager[] managers, Monarchy[] monarchies, Republic[] republics, PresidentRepublic[] presidentRepublics) {
        super(managers);
        this.monarchies = monarchies;
        this.republics = republics;
        this.presidentRepublics = presidentRepublics;
    }

    public Monarchy[] getMonarchies() {
        return monarchies;
    }

    public void setMonarchies(Monarchy[] monarchies) {
        this.monarchies = monarchies;
    }

    public Republic[] getRepublics() {
        return republics;
    }

    public void setRepublics(Republic[] republics) {
        this.republics = republics;
    }

    public PresidentRepublic[] getPresidentRepublics() {
        return presidentRepublics;
    }

    public void setPresidentRepublics(PresidentRepublic[] presidentRepublics) {
        this.presidentRepublics = presidentRepublics;
    }
}

