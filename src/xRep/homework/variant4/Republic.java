package xRep.homework.variant4;

public class Republic {

    private Proletarian[] proletarians;

    private Member[] members;

    private Manager[] managers;

    public Republic(Manager[] managers) {
        this.managers = managers;
    }

    public Republic(Member[] members) {
        this.members = members;
    }

    public Republic(Proletarian[] proletarians) {
        this.proletarians = proletarians;
    }

    public int[] max_minAge(){
        int temp1=0;
        int temp2=0;
        for(Manager i: proletarians){
            temp1=Math.max(temp1,i.getAge());
            temp2=Math.min(temp2, i.getAge());
        }

        return new int[]{temp1, temp2};
    }

    public int[] middleAge(){
        int count=0;
        int tempSum=0;
        for(Manager i: proletarians){
            tempSum+=i.getAge();
            count++;
        }
        return new int[]{tempSum,count};
    }

    public int counter(){
        return proletarians.length;
    }

    public Proletarian[] getProletarians() {
        return proletarians;
    }

    public void setProletarians(Proletarian[] proletarians) {
        this.proletarians = proletarians;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }
}
