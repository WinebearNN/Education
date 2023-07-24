package practice.constructors;

import java.util.Scanner;

public class Fisrt {
    int x;
    int y;

    public Fisrt() {
        Scanner a = new Scanner(System.in);
        x = a.nextInt();
        y = x + 5;

    }

    public static void main(String[] args) {
        Fisrt myObj = new Fisrt();
        System.out.println(myObj.y);
        System.out.println("ok");
    }
}
