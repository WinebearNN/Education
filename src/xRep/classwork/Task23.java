package xRep.classwork;

import java.util.ArrayList;
import java.util.List;

public class Task23 {
    public static void main(String[] args) {
        Integer[] array = {0,1,2,10,4,5,6};
        ArrayList<Integer> list=new ArrayList<>(List.of(array));
        System.out.println(ArrayListMethod.max(list));
    }
}
class ArrayListMethod{

    public ArrayListMethod() {

    }
    public static Integer max(ArrayList<Integer> list){
        Integer maxEl=Integer.MIN_VALUE;
        if(list.size()==0){
            return null;
        }
        if(list.isEmpty()){
            return null;
        }
        for(Integer i: list){
            maxEl=Math.max(i,maxEl);
        }
        return maxEl;
    }
}