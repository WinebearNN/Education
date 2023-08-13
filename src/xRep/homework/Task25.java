package xRep.homework;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Task25 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(6);
        li.add(7);
        li.add(10);
        ArrayListMethod.shuffle(li);
        System.out.println(li);
    }
}

class ArrayListMethod {
    public static void shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> lip = new ArrayList<>(list);
        while (lip.size() != 0) {
            Random ran = new Random();
            int index = ran.nextInt(lip.size());
            temp.add(lip.get(index));
            lip.remove(index);
        }
        list.clear();
        list.addAll(temp);

    }
}