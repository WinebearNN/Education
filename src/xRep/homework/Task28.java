package xRep.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task28 {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E[] array=(E[]) list.toArray();
        System.out.println(list);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 10, 10, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(array));
        Task28.sort(arrayList);
    }
}
