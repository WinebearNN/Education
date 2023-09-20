package xRep.homework.variant2;

public class Worker extends Person{

    private Detail[] details;

    public Worker(String name, String surname, String lastname, int age, Detail[] details) {
        super(name, surname, lastname, age);
        this.details = details;
    }

    public double workNormValue(){
        int count=0;
        double temp=0;
        for(Detail i:details){
            temp+=i.getKef();
            count++;
        }
        return temp/count;
    }

    public double salary(){
        return getBaseValue()*this.workNormValue();
    }
    public Detail[] getDetails() {
        return details;
    }

    public void setDetails(Detail[] details) {
        this.details = details;
    }
}
