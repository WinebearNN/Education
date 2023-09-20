package xRep.homework.variant2;

public class Factory {

    private Worker[] workers;
    private Engineer[] engineers;
    private Caretaker[] caretakers;
    private FactoryBoss[] factoryBosses;

    public Factory(Worker[] workers, Engineer[] engineers, Caretaker[] caretakers, FactoryBoss[] factoryBosses) {
        this.workers = workers;
        this.engineers = engineers;
        this.caretakers = caretakers;
        this.factoryBosses = factoryBosses;
    }

    public void minSalary(){
        double tma=0;
        double tmi=999999999;
        int count=0;
        double money=0;
        for(Worker i:workers){
            money+=i.salary();
            tma=Math.max(i.salary(),tma);
            tmi=Math.min(tmi,i.salary());
            count++;
        }
        System.out.println("Минимальная зарплата среди рабочих: " + tmi);
        System.out.println("Максимальная зарплата среди рабочих: " + tma);
        System.out.println("Кол-во человек на этой должности: " + count +  "/n");

        tma=0;
        count=0;
        tmi=999999999;
        for(Engineer i:engineers){
            money+=i.salary();
            tma=Math.max(i.salary(),tma);
            tmi=Math.min(tmi,i.salary());
            count++;
        }
        System.out.println("Минимальная зарплата среди инженеров: " + tmi);
        System.out.println("Максимальная зарплата среди инженеров: " + tma);
        System.out.println("Кол-во человек на этой должности: " + count +  "/n");

        tma=0;
        count=0;
        tmi=999999999;
        for(Caretaker i:caretakers){
            money+=i.salary();
            count++;
            tma=Math.max(i.salary(),tma);
            tmi=Math.min(tmi,i.salary());
        }
        System.out.println("Минимальная зарплата среди завхозов: " + tmi);
        System.out.println("Максимальная зарплата среди завхозов: " + tma);
        System.out.println("Кол-во человек на этой должности: " + count +  "/n");

        tma=0;
        tmi=999999999;
        count=0;
        for(FactoryBoss i:factoryBosses){
            money+=i.salary();
            tma=Math.max(i.salary(),tma);
            tmi=Math.min(tmi,i.salary());
            count++;
        }
        System.out.println("Минимальная зарплата среди начальников цеха: " + tmi);
        System.out.println("Максимальная зарплата среди начальников цеха: " + tma);
        System.out.println("Кол-во человек на этой должности: " + count +  "/n");
        System.out.println("Кол-во денег: " + money + "/n");
    }

}
