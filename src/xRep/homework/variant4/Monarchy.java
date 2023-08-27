package xRep.homework.variant4;

public class Monarchy  extends Republic{

    private TheMain main;

    public Monarchy(Manager[] managers, TheMain main) {
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
