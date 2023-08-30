package xRep.classwork;

import java.lang.reflect.Array;
import java.util.*;

public class Task27<E extends Number> {

    public static <E> void shuffle(ArrayList<E> list) {
        ArrayList<E> temp = new ArrayList<>();
        ArrayList<E> lip = new ArrayList<>(list);
        while (lip.size() != 0) {
            Random ran = new Random();
            int index = ran.nextInt(lip.size());
            temp.add(lip.get(index));
            lip.remove(index);
        }
        list.clear();
        list.addAll(temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
        String[] array=new String[]{"sds","eeee","ttttt","yyy"};
        ArrayList<String> example = new ArrayList<>(List.of(array));
        Task27.shuffle(example);
    }
}
