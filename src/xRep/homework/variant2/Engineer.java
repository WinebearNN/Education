package xRep.homework.variant2;

import xRep.homework.variant1.Human;

public class Engineer extends Person{

    //не понял, как считается перевыполнение нормы подчиненными,
    //поэтому решил создать поле для задания этого значения напрямую через
    //конструктор

    private Worker[] workers;
    private double workValue;

    public Engineer(String name, String surname, String lastname, int age, Worker[] workers, double workValue) {
        super(name, surname, lastname, age);
        this.workers=workers;
        this.workValue = workValue;
    }

    public double salary(){
        double bonus=1.0;
        double temp=averageK();
        if(temp>=workValue){
            bonus=1.1;
        }
        return getBaseValue()*temp*bonus;
    }

    public double averageK(){
        double temp=0;
        int count=0;
        for(Worker i:workers){
            count++;
            temp+=i.workNormValue();
        }
        return temp/count;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public double getWorkValue() {
        return workValue;
    }

    public void setWorkValue(double workValue) {
        this.workValue = workValue;
    }
}
