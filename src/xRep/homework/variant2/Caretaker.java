package xRep.homework.variant2;

public class Caretaker extends Worker {

    private FactoryBoss[] factoryBosses;

    public Caretaker(String name, String surname, String lastname, int age, Detail[] details, FactoryBoss[] factoryBosses) {
        super(name, surname, lastname, age, details);
        this.factoryBosses = factoryBosses;
    }

    @Override
    public double salary() {
        return super.salary() * 1.6;
    }

    public FactoryBoss[] getFactoryBosses() {
        return factoryBosses;
    }

    public void setFactoryBosses(FactoryBoss[] factoryBosses) {
        this.factoryBosses = factoryBosses;
    }
}
