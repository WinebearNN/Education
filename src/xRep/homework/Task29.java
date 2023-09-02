package xRep.homework;

import java.util.ArrayList;
import java.util.List;

public class Task29 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E temp = list.get(0);
        for (int i = 0; i < (list.size() - 1); i++) {
            if (list.get(i).compareTo(temp) == 1) {
                temp = list.get(i);
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 10, 10, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(array));
        System.out.println(Task29.max(arrayList));
    }
}
