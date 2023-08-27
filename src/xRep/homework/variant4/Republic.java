package xRep.homework.variant4;

public class Republic {

    private Manager[] managers;

    public Republic(Manager[] managers) {
        this.managers = managers;
    }

    public int[] max_minAge(){
        int temp1=0;
        int temp2=0;
        for(Manager i: managers){
            temp1=Math.max(temp1,i.getAge());
            temp2=Math.min(temp2, i.getAge());
        }

        return new int[]{temp1, temp2};
    }

    public int middleAge(){
        int count=0;
        int tempSum=0;
        for(Manager i: managers){
            tempSum+=i.getAge();
            count++;
        }
        return tempSum/count;
    }

    public int counter(){
        return managers.length;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }
}
