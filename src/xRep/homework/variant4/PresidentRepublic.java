package xRep.homework.variant4;

import java.util.ArrayList;

public class PresidentRepublic extends Republic {

    private  Manager manager;

    private Minister[] ministers;

    public PresidentRepublic(Minister[] ministers,Proletarian[] proletarians,Manager manager) {
        super(proletarians);
        this.ministers=ministers;
        this.manager=manager;
    }

    @Override
    public int[] max_minAge() {
        int tempMIN=manager.getAge();
        int tempMAX=manager.getAge();
        for (Minister i:ministers){
            tempMAX=Math.max(tempMAX,i.getAge());
            tempMIN=Math.min(tempMIN,i.getAge());
        }
        return new int[]{Math.max(super.max_minAge()[0],tempMAX),Math.min(super.max_minAge()[1],tempMIN)};
    }

    @Override
    public int[] middleAge() {
        int count=1;
        int temp=manager.getAge();
        for (Minister i:ministers){
            count++;
            temp+=i.getAge();
        }
        return new int[]{super.middleAge()[0]+temp,super.middleAge()[1]+count};
    }

    @Override
    public int counter() {
        return super.counter()+ministers.length+1;
    }
}
