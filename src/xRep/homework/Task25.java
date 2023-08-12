package xRep.homework;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Task25 {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(6);
        ArrayListMethod.shuffle(li);
        System.out.println(li);
    }
}

class ArrayListMethod{
    public static void shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> lip = new ArrayList<>();
        lip = list;
        for (int i = 0; i < list.size(); i++) {
            Random ran = new Random();
            list.set(lip.size() - 1 - i, lip.get(i));


        }
    }
}