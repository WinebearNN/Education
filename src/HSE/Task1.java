package HSE;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        java.util.Date tempVar = new java.util.Date();
        simpleNumbers(s);
        java.util.Date tempVar1 = new java.util.Date();
//        System.out.println(tempVar.getTime());
//        System.out.println(tempVar1.getTime());
    }
    public static void simpleNumbers(int s){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=2;i<=s;i++){
            if (checkSimple(i)==0){
                System.out.println(i);
            }
        }

    }
    public static int checkSimple(int a){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=2;i<=Math.sqrt(a);i++){
            if (a%i==0){
                arrayList.add(i);
            }if(a%((int) a/i)==0){
                arrayList.add(i/2);
            }
        }
        return arrayList.size();
    }
}
