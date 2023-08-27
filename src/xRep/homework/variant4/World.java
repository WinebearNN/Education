package xRep.homework.variant4;

public class World {

    private Monarchy[] monarchies;

    private Republic[] republics;

    private PresidentRepublic[] presidentRepublics;

    private Confederation[] confederations;

    public World(Monarchy[] monarchies, Republic[] republics, PresidentRepublic[] presidentRepublics, Confederation[] confederations) {
        this.monarchies = monarchies;
        this.republics = republics;
        this.presidentRepublics = presidentRepublics;
        this.confederations = confederations;
    }

    public int counter() {
        int temp = 0;
        for (Monarchy i : monarchies) {
            temp += i.counter();
        }
        for (PresidentRepublic i : presidentRepublics) {
            temp += i.counter();
        }
        for (Republic i : republics) {
            temp += i.counter();
        }
        for (Confederation i : confederations) {
            temp += i.counter();
        }
        return temp;
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

    public Confederation[] getConfederations() {
        return confederations;
    }

    public void setConfederations(Confederation[] confederations) {
        this.confederations = confederations;
    }
}

