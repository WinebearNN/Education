package xRep.homework.variant4;

public class Monarchy  extends Republic{

    private Manager manager;

    private Member[] members;

    public Monarchy(Member[] members, Manager manager) {
        super(members);
        this.manager=manager ;
    }

    @Override
    public int[] max_minAge() {
        int tempMax=manager.getAge();
        int tempMin=manager.getAge();
        for (Member i:members){
            tempMin=Math.min(i.getAge(),tempMin);
            tempMax=Math.max(i.getAge(),tempMax);
        }
        return new int[]{Math.max(super.max_minAge()[1],tempMax),Math.min(tempMin,super.max_minAge()[1])};
    }

    @Override
    public int[] middleAge() {
        int count =1;
        int temp=manager.getAge();
        for(Member i:members){
            temp+=i.getAge();
            count++;
        }
        return new int[]{super.middleAge()[0]+temp,super.middleAge()[1]+count};
    }

    @Override
    public int counter() {
        return super.counter()+members.length+1;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Member[] getMembers() {
        return members;
    }

    @Override
    public void setMembers(Member[] members) {
        this.members = members;
    }
}
