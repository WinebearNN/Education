package xRep.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static int sumOfTwoNumbers() {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
        try {
            int sum=sumOfTwoNumbers();
            System.out.println(sum);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage() + " - " + "нахуй отсюда");
        }
    }
}

