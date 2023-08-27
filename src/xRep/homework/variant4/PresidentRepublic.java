package xRep.homework.variant4;

public class PresidentRepublic extends Republic {

    protected TheMain main;

    public PresidentRepublic(Manager[] managers, TheMain main) {
        super(managers);
        this.main=main;
    }

    public TheMain getMain() {
        return main;
    }

    public void setMain(TheMain main) {
        this.main = main;
    }
}
