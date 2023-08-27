package xRep.classwork.generics;

import java.util.ArrayList;
import java.util.List;

public class Task23<E> {

    public ArrayList<E> removeAllDublicate(ArrayList<E> arrayList){
        ArrayList<E> correctArrayList = new ArrayList<>();
        for(E temp:arrayList){
            if(correctArrayList.contains(temp)){
                continue;
            }else {
                correctArrayList.add(temp);
            }
        }
        return correctArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>(List.of(1,2,3,4,1,2,3,4));
        Task23<Integer> array1=new Task23<>();
        System.out.println(array1.removeAllDublicate(array));
    }
}
