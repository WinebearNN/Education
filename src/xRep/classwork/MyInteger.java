package xRep.classwork;

import myDevelopment.forArrays.AddToArrayValue;
import myDevelopment.forIntegerAndDouble.CheckNumberIsPrime;

import java.util.Arrays;

public class MyInteger {

    private int value;

    public int getValue() {
        return value;
    }

    public MyInteger() {
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int a) {
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int a) {
        if (CheckNumberIsPrime.CheckPrime(a).length == 0) {
            return true;
        }
        return false;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (this.value % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        if (CheckNumberIsPrime.CheckPrime(this.value).length == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(MyInteger b) {
        if (b.value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger b) {
        if (b.value % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(MyInteger b) {
        if (CheckNumberIsPrime.CheckPrime(b.value).length == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(int a) {
        if (this.value == a) {
            return true;
        }
        return false;

    }

    public boolean equals(MyInteger b) {
        if (this.value == b.value) {
            return true;
        }
        return false;
    }

    public static int[] parseInt(char[] alp) {
        int[] numbers = new int[alp.length];
        for (int i = 0; i < alp.length; i++) {
            numbers[i] = (int) alp[i];
        }
        return numbers;
    }

    public static int parseInt(String s) {
        int a = Integer.parseInt(s, 10);
        return a;
    }

}

class TestMyInteger {
    public static void main(String[] args) {
        char[] alp = {'a', '0', '1', '2', '3', '4'};
        int[] numbers = MyInteger.parseInt(alp);
        System.out.println(Arrays.toString(numbers));
        System.out.println(MyInteger.parseInt("1221") + 11);
    }
}
